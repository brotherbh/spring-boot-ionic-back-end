package com.techmais.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techmais.curso.domains.Estado;;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {
	
	

}//FP
