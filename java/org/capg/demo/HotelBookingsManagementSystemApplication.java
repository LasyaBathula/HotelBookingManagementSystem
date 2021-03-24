package org.capg.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="org.capg.demo")
public class HotelBookingsManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelBookingsManagementSystemApplication.class, args);
	}

}
