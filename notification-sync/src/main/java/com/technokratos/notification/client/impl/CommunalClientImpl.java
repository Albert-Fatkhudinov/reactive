package com.technokratos.notification.client.impl;

import com.technokratos.communal.dto.RequestPerson;
import com.technokratos.communal.dto.ResponseFines;
import com.technokratos.notification.client.CommunalClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RequiredArgsConstructor
public class CommunalClientImpl implements CommunalClient {

    private final RestTemplate template;

    @Override
    public ResponseFines getCommunalFines(RequestPerson person) {
        return template.postForObject("http://localhost:8081/communal/notification", person, ResponseFines.class);
    }
}
