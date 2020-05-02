package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.CustomerEntity;

public interface CustomerRepository extends JpaRepository<CustomerEntity, String>{

}
