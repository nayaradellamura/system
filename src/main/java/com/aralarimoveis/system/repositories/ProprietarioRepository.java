package com.aralarimoveis.system.repositories;

import com.aralarimoveis.system.models.Proprietario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProprietarioRepository extends JpaRepository<Proprietario, Long> {
}
