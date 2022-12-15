package com.edu.atividadeSpring.entity;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/* Implemente Serializable*/
@Entity
@Table(name = "tb_category")
public class Category implements Serializable{
	/* Serializable permite o objeto em java ser convertido em bytes */
	private static final long serialVersionUID = 1L;
	/* Atributos da classe Category*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant createAt;
	
	
	/* Metodos construtores ad classe Category*/
	public Category() {}
	public Category(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	/* MEtodos getters and setters da classe Category*/
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
	public Instant getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Instant createAt) {
		this.createAt = createAt;
	}
	
	/* Metodos hachCode*/
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
}
