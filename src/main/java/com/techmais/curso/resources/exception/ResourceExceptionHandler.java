package com.techmais.curso.resources.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import javassist.tools.rmi.ObjectNotFoundException;


@ControllerAdvice
public class ResourceExceptionHandler {
	
	
	public ResponseEntity<StanderError> objectNotFOund( ObjectNotFoundException e){
		
		
		StanderError err = new StanderError(HttpStatus.NOT_FOUND.value(), e.getMessage(), System.currentTimeMillis());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
		
	}//
	

}//FP
