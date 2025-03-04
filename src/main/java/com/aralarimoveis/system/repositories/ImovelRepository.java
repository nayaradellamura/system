package com.aralarimoveis.system.repositories;

import com.aralarimoveis.system.models.Imovel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImovelRepository extends JpaRepository<Imovel, Long> {
}
