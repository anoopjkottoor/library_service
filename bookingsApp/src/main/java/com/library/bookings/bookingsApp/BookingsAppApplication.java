package com.library.bookings.bookingsApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BookingsAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingsAppApplication.class, args);
	}

}
