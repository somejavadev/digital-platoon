package com.heinsmith.digitalplatoon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.heinsmith.digitalplatoon")
@EnableJpaRepositories(basePackages = "com.heinsmith.digitalplatoon.entities")
public class DigitalplatoonApplication {

    public static void main(String[] args) {
        SpringApplication.run(DigitalplatoonApplication.class, args);
    }
}
