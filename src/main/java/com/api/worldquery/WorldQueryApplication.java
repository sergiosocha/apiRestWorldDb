package com.api.worldquery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories

public class WorldQueryApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorldQueryApplication.class, args);
	}

}
