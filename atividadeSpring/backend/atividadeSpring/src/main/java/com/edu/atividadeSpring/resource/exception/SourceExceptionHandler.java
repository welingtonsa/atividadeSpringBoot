package com.edu.atividadeSpring.resource.exception;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.edu.atividadeSpring.service.exception.ResourceNotFoundException;

@ControllerAdvice
public class SourceExceptionHandler {
	/*Atributos da classe SourceExceptionHandler*/
	
	/*Metodo construtor da classe SourceExcetionHandler*/
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> entityNotFound(ResourceNotFoundException e, HttpServletRequest request){
		StandardError orr = new StandardError();
		orr.setTimestamp(Instant.now());
		orr.setStatus(HttpStatus.NOT_FOUND.value());
		orr.setError("Deu Ruim");
		orr.setMessage(e.getMessage());
		orr.setPath(request.getRequestURI());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(orr);
		
	}

}
