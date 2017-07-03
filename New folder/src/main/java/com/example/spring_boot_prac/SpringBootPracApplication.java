package com.example.spring_boot_prac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "controllers")
@EntityScan(basePackages ="controllers")
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = "controllers")
public class SpringBootPracApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPracApplication.class, args);
	}
}
