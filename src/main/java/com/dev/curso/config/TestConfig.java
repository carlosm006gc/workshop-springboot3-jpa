package com.dev.curso.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.dev.curso.entities.Order;
import com.dev.curso.entities.User;
import com.dev.curso.repositorys.OrderRepository;
import com.dev.curso.repositorys.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		User u = new User(null, "Carlos", "carlos@gmail.com", "61999656158", "carlos8245");
		User u1 = new User(null, "Maria", "maria@gmail.com", "61999656185", "maria8245");
		
		Order o = new Order(null, Instant.parse("2022-10-13T16:49:00Z"), u1);
		Order o1 = new Order(null, Instant.parse("2022-10-13T16:49:00Z"), u);
		
		userRepository.saveAll(Arrays.asList(u, u1));
		orderRepository.saveAll(Arrays.asList(o, o1));
		
	}
	
	
}
