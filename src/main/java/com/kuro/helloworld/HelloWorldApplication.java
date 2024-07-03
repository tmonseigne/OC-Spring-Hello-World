package com.kuro.helloworld;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //Annotation permettant de lancer la machine Spring
public class HelloWorldApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

	// Avec CommandLineRunner la méthode run sera forcément lancé par spring
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World");
	}
}
