package com.example.booking_service.repositories;

import com.example.booking_service.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

//    List<Booking> findByDate(String date);
}
