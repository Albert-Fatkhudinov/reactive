package com.technokratos.communal.controller;

import com.technokratos.communal.dto.CommunalFineDTO;
import com.technokratos.communal.dto.RequestPerson;
import com.technokratos.communal.dto.ResponseFines;
import com.technokratos.communal.service.CommunalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@RestController
@RequiredArgsConstructor
public class CommunalController {

    private final CommunalService service;

    @PostMapping("/communal/notification")
    public ResponseFines getCommunalFines(@RequestBody RequestPerson person) throws InterruptedException {
        TimeUnit.SECONDS.sleep(new Random().nextInt(3));
        ResponseFines responseFines = new ResponseFines();
        responseFines.setFines(service.getCommunalFines(person.getPersonName()));
        return responseFines;
    }
}
