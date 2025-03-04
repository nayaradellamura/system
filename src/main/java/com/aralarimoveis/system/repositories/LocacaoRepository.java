package com.aralarimoveis.system.repositories;

import com.aralarimoveis.system.models.Locacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocacaoRepository extends JpaRepository<Locacao, Long> {
}
