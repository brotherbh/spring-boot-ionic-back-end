package com.techmais.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.techmais.curso.domains.IntemPedido;

@Repository
public interface IntemPedidoRepository extends JpaRepository<IntemPedido, Integer> {
	
	

}//FP
