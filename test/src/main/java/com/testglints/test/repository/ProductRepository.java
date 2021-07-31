package com.testglints.test.repository;

import com.testglints.test.model.ProductModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductRepository extends JpaRepository<ProductModel, Integer> {
    

    @Query(value = "SELECT * FROM product_model WHERE id = :id", nativeQuery = true)
    public ProductModel getProductById(@Param("id") int id);
}
