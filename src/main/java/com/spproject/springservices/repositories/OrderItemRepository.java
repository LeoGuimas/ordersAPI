package com.spproject.springservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spproject.springservices.entities.OrderItem;
import com.spproject.springservices.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem,OrderItemPK> {

}
