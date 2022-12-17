package com.example.booking_service.repositories;

import com.example.booking_service.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

//    List<Customer> findByCourseName(String name);
}
