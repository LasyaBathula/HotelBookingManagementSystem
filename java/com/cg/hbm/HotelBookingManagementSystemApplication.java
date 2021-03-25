package com.cg.hbm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.cg")
public class HotelBookingManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelBookingManagementSystemApplication.class, args);
	}

}
