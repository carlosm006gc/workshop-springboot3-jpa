package com.dev.curso.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.curso.entities.OrderItem;
import com.dev.curso.services.OrderItemService;

@RestController
@RequestMapping(value = "/orders/Items")
public class OrderItemController {

	@Autowired
	private OrderItemService orderItemService;

	@GetMapping
	public ResponseEntity<List<OrderItem>> findAll() {
		List<OrderItem> list = orderItemService.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping("/{id}")
	public ResponseEntity<OrderItem> findById(@PathVariable Long id) {
		OrderItem orderItem = orderItemService.findById(id);
		return ResponseEntity.ok().body(orderItem);
	}

}
