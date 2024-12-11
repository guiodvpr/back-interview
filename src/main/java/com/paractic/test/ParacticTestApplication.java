package com.paractic.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.validation.annotation.Validated;

@SpringBootApplication
@Validated
public class ParacticTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParacticTestApplication.class, args);
	}

}
