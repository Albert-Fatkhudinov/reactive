package com.technokratos.notification.client;

import com.technokratos.communal.dto.CommunalFineDTO;
import com.technokratos.communal.dto.RequestPerson;
import org.springframework.web.bind.annotation.RequestBody;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;


public interface CommunalClient {

    Mono<List<CommunalFineDTO>> getCommunalFines(@RequestBody RequestPerson person);
}
