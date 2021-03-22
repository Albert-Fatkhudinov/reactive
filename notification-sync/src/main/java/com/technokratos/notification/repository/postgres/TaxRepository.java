package com.technokratos.notification.repository.postgres;

import com.technokratos.notification.model.Tax;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaxRepository extends JpaRepository<Tax, Long> {
}
