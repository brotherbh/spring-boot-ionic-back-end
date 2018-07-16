package com.techmais.curso.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techmais.curso.domains.Pedido;
import com.techmais.curso.repository.PedidoRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class PedidoService{

	@Autowired
	private PedidoRepository PedidoRepository;
	

	
	
	public Pedido buscarC(Integer id) throws ObjectNotFoundException {
		
		Optional<Pedido> objCat = PedidoRepository.findById(id);
	
		return objCat.orElseThrow(()-> new ObjectNotFoundException("Objeto não Encontrado! ID = " + id + " Tipo " + Pedido.class.getName()));
	}//
	
	
}//FP
