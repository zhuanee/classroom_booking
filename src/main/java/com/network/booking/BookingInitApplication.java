package com.network.booking;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.network.booking.mapper")
@SpringBootApplication
public class BookingInitApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookingInitApplication.class, args);
    }

}
