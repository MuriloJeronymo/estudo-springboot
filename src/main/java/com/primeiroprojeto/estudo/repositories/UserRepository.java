package com.primeiroprojeto.estudo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primeiroprojeto.estudo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
