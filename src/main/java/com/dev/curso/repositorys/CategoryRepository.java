package com.dev.curso.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
