package com.testglints.test.repository;

import com.testglints.test.model.BuyTypeModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BuyTypeRepository extends JpaRepository<BuyTypeModel, Integer> {

    @Query(value = "SELECT * FROM buy_type_model WHERE id = :id", nativeQuery = true)
    public BuyTypeModel getBuyTypeById(@Param("id") int id);
    
}

