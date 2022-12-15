package com.edu.atividadeSpring.DTO;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.edu.atividadeSpring.entity.Category;
import com.edu.atividadeSpring.entity.Product;

public class ProductDTO implements Serializable {
	/*Atributos da classe Product*/
	/* Serializable permite o objeto em java ser convertido em bytes */
	private static final long serialVersionUID = 1L;
	/*Atributos da classe Product*/
	private Long id;
	private String name;
	private String description;
	private Double price;
	private String imgURL;
	private Instant date;
	
	private List<Category> categories = new ArrayList<>();
	
	/* Metodos construtores da classe ProductDTO*/
	public ProductDTO() {}
	public ProductDTO(Long id, String name, String description, Double price, String imgURL, Instant date) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.imgURL = imgURL;
		this.date = date;
	}
	public ProductDTO(Product entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.description = entity.getDescription();
		this.price = entity.getPrice();
		this.imgURL = entity.getImgURL();
		this.date = entity.getDate();
	}
	
	public ProductDTO(Product entity, Set<Category> categories) {
		this.(entity);
		categories.forEach(cat ->this.categories.add(new CategoryDTO(cat)));
	}
	
	/*Metodos getters and setters da classe ProductDTO*/
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getImgURL() {
		return imgURL;
	}
	public void setImgURL(String imgURL) {
		this.imgURL = imgURL;
	}
	public Instant getDate() {
		return date;
	}
	public void setDate(Instant date) {
		this.date = date;
	}
	public List<Category> getCategories() {
		return categories;
	}
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	
}
