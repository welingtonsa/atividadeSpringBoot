package com.edu.atividadeSpring.service.exception;

public class ResourceNotFoundException extends RuntimeException  {
	/*Atributos da classe EntityNotFoundException */
	/* Serializable permite o objeto em java ser convertido em bytes */
	private static final long serialVersionUID = 1L; 
	
	/*Metodos da Classe EntityNotFoundException*/
	public ResourceNotFoundException(String msg) {
		super(msg);
	}
}
