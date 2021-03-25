package com.technokratos.notification.service.impl;

import com.technokratos.communal.dto.RequestPerson;
import com.technokratos.notification.client.CommunalClient;
import com.technokratos.notification.dto.NotificationDTO;
import com.technokratos.notification.mapper.NotificationMapper;
import com.technokratos.notification.repository.mongo.FineRepository;
import com.technokratos.notification.repository.postgres.TaxRepository;
import com.technokratos.notification.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class NotificationServiceImpl implements NotificationService {

    private final TaxRepository taxRepository;
    private final FineRepository fineRepository;
    private final CommunalClient communalClient;
    private final NotificationMapper mapper;


    @Override
    public Flux<NotificationDTO> getNotifications(RequestPerson person) {
        return taxRepository.findAllByPersonName(person.getPersonName())
                .map(mapper::toNotification)
                .concatWith(fineRepository.findAllByPersonName(person.getPersonName())
                        .filter(fine -> person.getPersonName().equals(fine.getPersonName()))
                        .map(mapper::toNotification))
                .concatWith(communalClient.getCommunalFines(person).flatMapIterable(res -> res)
                        .map(mapper::toNotification));
    }
}
