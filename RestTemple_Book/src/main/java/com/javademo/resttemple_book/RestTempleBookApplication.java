package com.javademo.resttemple_book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RestTempleBookApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestTempleBookApplication.class, args);
    }

}
