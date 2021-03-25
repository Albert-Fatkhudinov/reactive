package com.technokratos.notification.service;

import com.technokratos.communal.dto.RequestPerson;
import com.technokratos.notification.dto.NotificationDTO;
import reactor.core.publisher.Flux;

import java.util.List;

public interface NotificationService {

    Flux<NotificationDTO> getNotifications(RequestPerson person);
}
