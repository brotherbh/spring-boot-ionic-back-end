package com.techmais.curso;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.techmais.curso.domains.Categoria;
import com.techmais.curso.repository.CategoriaRepository;

@SpringBootApplication
public class CursoModeloConceitualApplication  implements CommandLineRunner{
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	
	

	public static void main(String[] args) {
		SpringApplication.run(CursoModeloConceitualApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		

		Categoria cat1 = new Categoria(null,"Informatica");
		Categoria cat2 = new Categoria(null,"Escritorio");
		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
		
	}
	
	
	
	
}//FP
