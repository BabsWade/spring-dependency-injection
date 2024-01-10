package com.unchk.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.unchk.helloworld.model.Helloworld;
import com.unchk.helloworld.service.BusinessService;

//Cette classe est l'entrée principale de l'application Spring Boot.
@SpringBootApplication
public class HelloWorldApplication implements CommandLineRunner{

	// Injection automatique du service BusinessService par Spring.
	@Autowired
	private BusinessService bs;
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		
		
		// Appel d'une méthode du service pour obtenir une instance de Helloworld.
		Helloworld hw = bs.getHelloworld();
		System.out.println(hw);
		
	}
	

}
