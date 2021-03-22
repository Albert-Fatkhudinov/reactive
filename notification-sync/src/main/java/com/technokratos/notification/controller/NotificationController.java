package com.technokratos.notification.controller;

import com.technokratos.communal.dto.RequestPerson;
import com.technokratos.notification.dto.NotificationDTO;
import com.technokratos.notification.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class NotificationController {

    private final NotificationService service;

    @GetMapping("/notifications")
    public List<NotificationDTO> getNotifications() {
        RequestPerson person = new RequestPerson();
        person.setPersonName("ИВАН");
        return  service.getNotifications(person);
    }
}
