package com.irbouh.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @author irbouho
 * @since 1.0.0
 */
@SpringBootApplication
@RestController
public class HelloApplication {

	@GetMapping("/v1/")
	public String home() {
		return "Hello World - " + LocalDateTime.now();
	}

	public static void main(String... args) {
		SpringApplication.run(HelloApplication.class, args);
	}

}