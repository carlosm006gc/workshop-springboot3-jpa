package com.dev.curso.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.curso.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1l, "Carlos", "carlos@gmail.com", "61999656158", "carlos8245");
		return ResponseEntity.ok().body(u);
	}

}
