package com.kuro.helloworld;

import com.kuro.helloworld.service.BusinessService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest	// Annotation permettant de lancer la machine Spring pour les tests
class HelloWorldApplicationTests {

	@Autowired
	private BusinessService bs;

	@Test		// Test le chargement du contexte Spring
	void contextLoads() { }

	@Test
	void testGetHelloWorld(){
		String expected = "Hello World";
		String result = bs.getHelloWorld().getValue();
		assertEquals(expected, result);
	}

}
