package com.edu.atividadeSpring.service;

import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.atividadeSpring.DTO.CategoryDTO;
import com.edu.atividadeSpring.entity.Category;
import com.edu.atividadeSpring.repository.CategoryRepository;
import com.edu.atividadeSpring.service.exception.ResourceNotFoundException;

@Service
public class CategoryService {
	/* Atributos da classe CategoryService*/
	@Autowired
	private CategoryRepository repository;
	
	@Transactional(readOnly = true)
	public Page<CategoryDTO> findAllPaged(PageRequest pageRequest){
		Page<Category> list = repository.findAll(pageRequest);
		
		return list.map(x -> new CategoryDTO(x));
		
	}
	
	@Transactional(readOnly = true)
	public CategoryDTO findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		Category entity = obj.orElseThrow(()-> new EntityNotFoundException("Entity not found!"));
		return new CategoryDTO(entity);
		
	}
	
	@Transactional
	public CategoryDTO insert(CategoryDTO dto) {
		Category entity = new Category();
		entity.setName(dto.getName());
		entity = repository.save(entity);
		return new CategoryDTO(entity);
	}
	
	@Transactional
	public CategoryDTO update (CategoryDTO dto) {
		try {
			Category entity = new repository.getOne(id);
			entity.setName((dto.getName());
			entity = repositpry.save(entity);
			return new CategoryDTO(entity);
		}
		catch(ResourceNotFoundException e) {
			return ResourceNotFoundException("Id não encontrado");
		}
	
	}

}
