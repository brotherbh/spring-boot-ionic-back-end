package com.techmais.curso.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techmais.curso.domains.Categoria;
import com.techmais.curso.repository.CategoriaRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class CategoriaService{

	@Autowired
	private CategoriaRepository categoriaRepository;
	

	
	
	public Categoria buscarC(Integer id) throws ObjectNotFoundException {
		
		Optional<Categoria> objCat = categoriaRepository.findById(id);
	
		return objCat.orElseThrow(()-> new ObjectNotFoundException("Objeto não Encontrado! ID = " + id + " Tipo " + Categoria.class.getName()));
	}//
	
	
	public Categoria insert(Categoria obj) {
		
		obj.setId(null);
		return categoriaRepository.save(obj);
	}


	public Categoria update(Categoria obj) throws ObjectNotFoundException {
	
		buscarC(obj.getId());
		
		return categoriaRepository.save(obj);
		
		
	}//
	
	
	
	
	
}//FP
