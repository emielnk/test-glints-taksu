package com.testglints.test.repository;

import com.testglints.test.model.UserModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<UserModel, Integer> {

    @Query(value = "SELECT * FROM user_model WHERE id = :id", nativeQuery = true)
    public UserModel getUserById(@Param("id") int id);
    
}
