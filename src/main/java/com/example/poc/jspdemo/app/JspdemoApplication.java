package com.example.poc.jspdemo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.example.poc.*")
@EntityScan("com.example.poc.jspdemo.entity")
@EnableJpaRepositories("com.example.poc.jspdemo.repository")
public class JspdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JspdemoApplication.class, args);
    }

}
