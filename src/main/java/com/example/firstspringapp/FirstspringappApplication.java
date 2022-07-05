package com.example.firstspringapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

@SpringBootApplication
public class FirstspringappApplication {

    public static void main(String[] args) {

        SpringApplication.run(FirstspringappApplication.class, args);
        System.out.println("*** Welcome To My First Spring Application ***");
    }
}
