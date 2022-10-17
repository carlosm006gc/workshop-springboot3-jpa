package com.dev.curso.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
