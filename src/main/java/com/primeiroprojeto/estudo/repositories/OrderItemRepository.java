package com.primeiroprojeto.estudo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primeiroprojeto.estudo.entities.OrderItem;
import com.primeiroprojeto.estudo.entities.pk.OrderItemPk;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> {

}
