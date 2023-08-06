package com.devHamster.inicioSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devHamster.inicioSpring.entities.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
