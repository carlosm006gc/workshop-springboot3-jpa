package com.dev.curso.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
