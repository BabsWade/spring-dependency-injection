package com.unchk.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.unchk.helloworld.model.Helloworld;
import com.unchk.helloworld.service.BusinessService;

//Cette classe est l'entrée principale de l'application Spring Boot.
@SpringBootApplication
public class HelloWorldApplication implements CommandLineRunner{
	private static final Logger log = LoggerFactory.getLogger(HelloWorldApplication.class);
	// Injection automatique du service BusinessService par Spring.
	@Autowired
	private BusinessService bs;
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		
		
		// Appel d'une méthode du service pour obtenir une instance de Helloworld.
		/**Helloworld hw = bs.getHelloworld();
		System.out.println(hw);
		
		// Ajoutez des messages de journalisation pour suivre le flux d'exécution.
	    log.info("Début de l'exécution de la méthode run.");
	    
	    Helloworld hw1 = bs.getHelloworld();
	    System.out.println(hw1);
	    
	    log.info("Fin de l'exécution de la méthode run.");**/
		
		if (bs != null) {
	        Helloworld hw = bs.getHelloworld();
	        if (hw != null) {
	            System.out.println(hw);
	        } else {
	            log.error("Le service BusinessService a renvoyé une instance de Helloworld nulle.");
	        }
	    } else {
	        log.error("Le service BusinessService est null.");
	    }
		
	}
	

}
