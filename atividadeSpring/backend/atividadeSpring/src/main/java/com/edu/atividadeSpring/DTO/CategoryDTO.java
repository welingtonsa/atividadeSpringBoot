package com.edu.atividadeSpring.DTO;

import java.io.Serializable;

import com.edu.atividadeSpring.entity.Category;

public class CategoryDTO implements Serializable{
	/* Serializable permite o objeto em java ser convertido em bytes */
	private static final long serialVersionUID = 1L;
	/*Atributos da classe CategoryDTO*/
	private Long id;
	private String name;
	
	/*Construtor da classe CategoryDTO*/
	public CategoryDTO() {}
	
	public CategoryDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public CategoryDTO(Category entity) {
		this.id = entity.getId();
		this.name = entity.getName();
	}
	
	/* Metodos getters and setters da classe CategoryDTO*/
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
	
