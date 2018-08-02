package com.techmais.curso.resources;



import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.techmais.curso.domains.Categoria;

import com.techmais.curso.services.CategoriaService;

import javassist.tools.rmi.ObjectNotFoundException;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {


	@Autowired
	private CategoriaService catService;
	
	
	@RequestMapping( value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> listar(@PathVariable Integer id) {
		
			Categoria obj;
			
				try {
					
					obj = catService.buscarC(id);
					return ResponseEntity.ok().body(obj);
					
				} catch (ObjectNotFoundException e) {
					return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage()); }//	
	
	}//
	
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> iserir(@RequestBody Categoria obj){
		
		obj = catService.insert(obj);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("{/id}").buildAndExpand(obj.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
		
	}//
	
	
	
	@RequestMapping( value="/{id}", method=RequestMethod.PUT)
	public ResponseEntity<Void> atualizar(@RequestBody Categoria obj, @PathVariable Integer id){
		
		obj.setId(id);
		try {
			obj = catService.update(obj);
		} catch (ObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ResponseEntity.noContent().build();
		
	}//
	
	
	
}//FP
