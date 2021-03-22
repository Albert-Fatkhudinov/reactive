package com.technokratos.notification.service;

import com.technokratos.communal.dto.RequestPerson;
import com.technokratos.notification.dto.NotificationDTO;

import java.util.List;

public interface NotificationService {

    List<NotificationDTO> getNotifications(RequestPerson person);
}
