package com.technokratos.notification.repository.mongo;

import com.technokratos.notification.model.Fine;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

import java.util.List;

public interface FineRepository extends ReactiveMongoRepository<Fine, String> {

    Flux<Fine> findAllByPersonName(String personName);
}
