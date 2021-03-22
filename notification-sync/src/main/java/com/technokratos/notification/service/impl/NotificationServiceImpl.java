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

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class NotificationServiceImpl implements NotificationService {

    private final TaxRepository taxRepository;
    private final FineRepository fineRepository;
    private final CommunalClient communalClient;
    private final NotificationMapper mapper;


    @Override
    public List<NotificationDTO> getNotifications(RequestPerson person) {
        List<NotificationDTO> taxs = taxRepository.findAll().stream()
                .filter(tax -> person.getPersonName().equals(tax.getPersonName()))
                .map(mapper::toNotification)
                .collect(Collectors.toList());
        List<NotificationDTO> fines = fineRepository.findAll().stream()
                .filter(fine -> person.getPersonName().equals(fine.getPersonName()))
                .map(mapper::toNotification)
                .collect(Collectors.toList());
        List<NotificationDTO> collect = communalClient.getCommunalFines(person).getFines().stream()
                .map(mapper::toNotification)
                .collect(Collectors.toList());
        List<NotificationDTO> notifications = new ArrayList<>();
        notifications.addAll(taxs);
        notifications.addAll(fines);
        notifications.addAll(collect);
        return notifications;
    }
}
