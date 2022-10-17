
package com.dev.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.curso.entities.OrderItem;
import com.dev.curso.repositorys.OrderItemRepository;

@Service
public class OrderItemService {

	@Autowired
	private OrderItemRepository orderItemRepository;
	
	public List<OrderItem> findAll() {
		return orderItemRepository.findAll();
	}
	public OrderItem findById(Long id) {
		Optional<OrderItem> orderItem = orderItemRepository.findById(id);
		return orderItem.get();
	}
}
