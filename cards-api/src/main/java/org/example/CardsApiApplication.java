package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CardsApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(CardsApiApplication.class, args);
        System.out.println("Hello world!");
    }
}