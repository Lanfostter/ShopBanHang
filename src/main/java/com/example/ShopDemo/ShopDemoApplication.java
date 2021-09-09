package com.example.ShopDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.ShopDemo"})
public class ShopDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopDemoApplication.class, args);
    }

}