package com.testglints.test.repository;

import com.testglints.test.model.EvoucherModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface EvoucherModelRepository extends JpaRepository<EvoucherModel, Integer>{

    @Query(value = "SELECT * FROM evoucher_model WHERE id = :id", nativeQuery = true)
    public EvoucherModel getVoucherById(@Param("id") int id);

    @Query(value = "SELECT * FROM evoucher_model WHERE code = :code", nativeQuery = true)
    public EvoucherModel getVoucherByCode(@Param("code") String code);

}
