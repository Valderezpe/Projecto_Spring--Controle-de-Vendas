package com.valderezpe.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valderezpe.domain.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
