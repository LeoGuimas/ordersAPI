package com.spproject.springservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spproject.springservices.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
