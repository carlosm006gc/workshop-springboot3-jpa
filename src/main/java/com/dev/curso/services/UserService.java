package com.dev.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.curso.entities.User;
import com.dev.curso.repositorys.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll() {
		return userRepository.findAll();
	}
	public User findById(Long id) {
		Optional<User> user = userRepository.findById(id);
		return user.get();
	}
}
