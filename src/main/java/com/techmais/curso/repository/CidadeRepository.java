package com.techmais.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techmais.curso.domains.Cidade;;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
		

}//FP
