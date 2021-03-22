package com.technokratos.notification.controller;

import com.technokratos.communal.dto.RequestPerson;
import com.technokratos.notification.dto.NotificationDTO;
import com.technokratos.notification.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class NotificationController {

    private final NotificationService service;

    @PostMapping("/notifications")
    public List<NotificationDTO> getNotifications(@RequestBody RequestPerson person) {
        return  service.getNotifications(person);
    }

}
