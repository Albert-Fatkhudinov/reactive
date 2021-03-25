package com.technokratos.notification.client.impl;

import com.technokratos.communal.dto.CommunalFineDTO;
import com.technokratos.communal.dto.RequestPerson;
import com.technokratos.communal.dto.ResponseFines;
import com.technokratos.notification.client.CommunalClient;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;
import reactor.util.retry.Retry;

import java.time.Duration;
import java.util.List;

@Component
@RequiredArgsConstructor
public class CommunalClientImpl implements CommunalClient {

    private final WebClient client;

    @Override
    public Mono<List<CommunalFineDTO>> getCommunalFines(RequestPerson person) {
        return client.post()
                .uri("http://localhost:8081/communal/notification")
                .bodyValue(person)
                .retrieve()
                .bodyToMono(ResponseFines.class)
                .retry()
                .map(responseFines -> responseFines.getFines());
    }
}
