package com.example.spring_crud_react.repository;

import com.example.spring_crud_react.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository  extends JpaRepository<Customer, Long> {
}
