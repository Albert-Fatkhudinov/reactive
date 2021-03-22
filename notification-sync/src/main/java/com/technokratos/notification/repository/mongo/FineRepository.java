package com.technokratos.notification.repository.mongo;

import com.technokratos.notification.model.Fine;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface FineRepository extends MongoRepository<Fine, String> {

    List<Fine> findAllByPersonName(String personName);
}
