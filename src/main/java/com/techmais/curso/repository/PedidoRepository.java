package com.techmais.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techmais.curso.domains.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
