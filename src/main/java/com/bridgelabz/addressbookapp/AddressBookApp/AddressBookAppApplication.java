package com.bridgelabz.addressbookapp.AddressBookApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import lombok.extern.slf4j.Slf4j;

@Slf4j // Enables logging
@SpringBootApplication
public class AddressBookAppApplication {
	public static void main(String[] args) {
		// Store ApplicationContext to access environment properties
		ApplicationContext context = SpringApplication.run(AddressBookAppApplication.class, args);

		// Log the active environment
		log.info("Address Book App started in {} Environment",
				context.getEnvironment().getProperty("spring.profiles.active", "default"));
	}
}

