package com.example.booking_service.components;

import com.example.booking_service.models.Booking;
import com.example.booking_service.models.Course;
import com.example.booking_service.models.Customer;
import com.example.booking_service.repositories.BookingRepository;
import com.example.booking_service.repositories.CourseRepository;
import com.example.booking_service.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader() {}

    public void run(ApplicationArguments args) {

        Customer esau = new Customer("Esau", "Glasgow", 88);
        customerRepository.save(esau);
        Customer georgia = new Customer("Georgia", "Dunbar", 30);
        customerRepository.save(georgia);
        Customer takako = new Customer("Takako", "Glasgow", 46);
        customerRepository.save(takako);

        Course fingerPainting = new Course("Finger Painting", "Edinburgh", 5);
        courseRepository.save(fingerPainting);
        Course wreathMaking = new Course("Wreath Making", "Dunbar", 4);
        courseRepository.save(wreathMaking);
        Course waterColourPainting = new Course("Water Colour Painting", "Glasgow", 1);
        courseRepository.save(waterColourPainting);

        Booking booking1 = new Booking("11-01-33", fingerPainting, esau);
        bookingRepository.save(booking1);
        Booking booking2 = new Booking("20-12-22", wreathMaking, georgia);
        bookingRepository.save(booking2);
        Booking booking3 = new Booking("12-11-22", waterColourPainting, takako);
        bookingRepository.save(booking3);
        Booking booking4 = new Booking("01-02-23", wreathMaking, esau);
        bookingRepository.save(booking4);
        Booking booking5 = new Booking("01-02-23", fingerPainting, georgia);
        bookingRepository.save(booking5);

//        esau.addBooking(booking1);
//        esau.addBooking(booking4);
//        customerRepository.save(esau);
//
//        georgia.addBooking(booking2);
//        georgia.addBooking(booking3);
//        customerRepository.save(georgia);
//
//        takako.addBooking(booking5);
//        customerRepository.save(takako);



    }



}
