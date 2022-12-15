package com.edu.atividadeSpring.resource.exception;

import java.io.Serializable;
import java.time.Instant;

public class StandardError implements Serializable {
	/* Serializable permite o objeto em java ser convertido em bytes */
	private static final long serialVersionUID = 1L;
	/*Atributos da classe StandError */
	private Instant timestamp;
	private Integer status;
	private String error;
	private String message;
	private String path;
	
	/*Construtor da classe StandError*/
	public StandardError() {}

	public Instant getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Instant timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	

}
