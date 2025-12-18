package com.home;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class MsSpringBoot4X1001Application {

	public static void main(String[] args) {

		SpringApplication.run(MsSpringBoot4X1001Application.class, args);
	}

}
