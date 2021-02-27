package com.simulador.compra.repository;

import com.simulador.compra.model.persistence.PayDays;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayDaysRepository extends JpaRepository<PayDays, Long> {

}
