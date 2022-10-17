package com.dev.curso.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
