package com.aralarimoveis.system.repositories;

import com.aralarimoveis.system.models.Recibo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReciboRepository extends JpaRepository<Recibo, Long> {
}
