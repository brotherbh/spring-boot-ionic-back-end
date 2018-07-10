package com.techmais.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techmais.curso.domains.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

}
