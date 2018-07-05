package com.techmais.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techmais.curso.domains.Produto;;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
	
	

}//FP
