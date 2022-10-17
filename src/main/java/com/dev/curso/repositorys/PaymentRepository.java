package com.dev.curso.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.curso.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long>{

}
