package com.testglints.test.repository;

import com.testglints.test.model.OrderModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderModel, Integer> {
    
}
