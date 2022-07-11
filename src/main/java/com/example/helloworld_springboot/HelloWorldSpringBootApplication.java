package com.example.helloworld_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldSpringBootApplication.class, args);
        System.out.println("Hello From Bridgelabz");
    }

}
