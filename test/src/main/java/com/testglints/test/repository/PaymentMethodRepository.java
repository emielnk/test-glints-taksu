package com.testglints.test.repository;

import com.testglints.test.model.PaymentMethodModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PaymentMethodRepository extends JpaRepository<PaymentMethodModel, Integer> {

    @Query(value = "SELECT * FROM payment_method_model WHERE id = :id", nativeQuery = true)
    public PaymentMethodModel getPaymentMethodById(@Param("id") int id);
    
}
