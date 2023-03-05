package com.example.unitTestingExampleControllerandData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com"})
public class UnitTestingExampleControllerandDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnitTestingExampleControllerandDataApplication.class, args);
	}

}
