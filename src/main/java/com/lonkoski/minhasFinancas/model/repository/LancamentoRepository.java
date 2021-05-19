package com.lonkoski.minhasFinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lonkoski.minhasFinancas.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

}
