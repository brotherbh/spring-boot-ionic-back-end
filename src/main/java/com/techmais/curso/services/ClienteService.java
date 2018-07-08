package com.techmais.curso.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techmais.curso.domains.Cliente;
import com.techmais.curso.repository.ClienteRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class ClienteService{

	@Autowired
	private ClienteRepository clienteRepository;
	

	
	
	public Cliente buscarC(Integer id) throws ObjectNotFoundException {
		
		Optional<Cliente> objCat = clienteRepository.findById(id);
	
		return objCat.orElseThrow(()-> new ObjectNotFoundException("Objeto não Encontrado! ID = " + id + " Tipo " + Cliente.class.getName()));
	}//
	
	
}//FP
