package com.devHamster.inicioSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devHamster.inicioSpring.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long>{
	
}
