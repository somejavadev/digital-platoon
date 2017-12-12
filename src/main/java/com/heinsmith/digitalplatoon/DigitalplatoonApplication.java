package com.heinsmith.digitalplatoon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.heinsmith.digitalplatoon")
public class DigitalplatoonApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigitalplatoonApplication.class, args);
	}
}
