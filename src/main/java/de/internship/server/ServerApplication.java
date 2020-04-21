package de.internship.server;

import de.internship.server.controller.HomeController;
import de.internship.server.controller.MessageController;
import de.internship.server.controller.VertretungsController;
import de.internship.server.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses= HomeController.class)
@ComponentScan(basePackageClasses = VertretungsController.class)
@ComponentScan(basePackageClasses = MessageController.class)
public class ServerApplication {

	@Autowired
	private BookRepository repository;

	public static void main(String[] args) throws Exception {

		SpringApplication.run(ServerApplication.class, args);
	}

}
