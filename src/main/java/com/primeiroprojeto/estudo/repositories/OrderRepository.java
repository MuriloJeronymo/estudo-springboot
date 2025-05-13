package com.primeiroprojeto.estudo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primeiroprojeto.estudo.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
