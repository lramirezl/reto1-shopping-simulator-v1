package com.simulador.compra.repository;

import com.simulador.compra.model.persistence.Share;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShareRepository extends JpaRepository<Share, Long> {

}
