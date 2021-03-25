package com.technokratos.notification.repository.postgres;

import com.technokratos.notification.model.Tax;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Flux;

public interface TaxRepository extends R2dbcRepository<Tax, Long> {

    Flux<Tax> findAllByPersonName(String name);
}
