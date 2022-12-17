package com.example.booking_service.repositories;

import com.example.booking_service.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findByRating(int rating);

    List<Course> findByBookingsCustomerNameIgnoreCase(String name);
}
