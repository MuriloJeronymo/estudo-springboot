package com.primeiroprojeto.estudo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primeiroprojeto.estudo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}
