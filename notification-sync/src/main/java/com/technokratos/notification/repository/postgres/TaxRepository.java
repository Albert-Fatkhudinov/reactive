package com.technokratos.notification.repository.postgres;

import com.technokratos.notification.model.Tax;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaxRepository extends JpaRepository<Tax, Long> {

    List<Tax> findAllByPersonName(String personName);
}
