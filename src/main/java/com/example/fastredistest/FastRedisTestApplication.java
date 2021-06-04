package com.example.fastredistest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class FastRedisTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(FastRedisTestApplication.class, args);
    }

}
