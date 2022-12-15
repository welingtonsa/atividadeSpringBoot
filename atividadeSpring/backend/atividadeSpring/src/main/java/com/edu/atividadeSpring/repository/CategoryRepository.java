package com.edu.atividadeSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.atividadeSpring.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository <Category, Long> {

}
