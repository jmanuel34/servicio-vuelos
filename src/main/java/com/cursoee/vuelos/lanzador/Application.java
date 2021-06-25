package com.cursoee.vuelos.lanzador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.cursoee.vuelos.dao")
@EntityScan(basePackages = "com.cursoee.vuelos.model")
@SpringBootApplication(scanBasePackages = {"com.cursoee.vuelos.controller",
											"com.cursoee.vuelos.service"})


public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
