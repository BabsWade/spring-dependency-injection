package com.unchk.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.unchk.helloworld.model.Helloworld;
import com.unchk.helloworld.service.BusinessService;

@SpringBootApplication
public class HelloWorldApplication implements CommandLineRunner{

	@Autowired
	private BusinessService bs;
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Helloworld hw = bs.getHelloworld();
		System.out.println(hw);
		
	}
	

}
