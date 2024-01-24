package com.example.gcp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	private final RandomDataService randomDataService;

	@Autowired
	public Application(RandomDataService randomDataService) {
		this.randomDataService = randomDataService;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) {
		randomDataService.generateAndSaveRandomData();
	}
}