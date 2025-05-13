package com.primeiroprojeto.estudo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primeiroprojeto.estudo.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
