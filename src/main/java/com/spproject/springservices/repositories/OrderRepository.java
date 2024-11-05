package com.spproject.springservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spproject.springservices.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
