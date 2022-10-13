package com.dev.curso.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
