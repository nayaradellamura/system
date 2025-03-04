package com.aralarimoveis.system.repositories;

import com.aralarimoveis.system.models.Inquilino;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InquilinoRepository extends JpaRepository<Inquilino, Long> {
}
