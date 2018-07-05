package com.techmais.curso.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techmais.curso.domains.Categoria;
import com.techmais.curso.repository.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	
	
	
	public Categoria buscarC(Integer id) {
		
		Optional<Categoria> objCat = categoriaRepository.findById(id);
		
		return objCat.orElse(null);
	}//
	
	
}//FP
