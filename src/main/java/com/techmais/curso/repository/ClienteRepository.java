package com.techmais.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techmais.curso.domains.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
