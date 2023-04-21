package org.bedu.postwork.javase2project;

import org.bedu.postwork.javase2project.model.Estudiante;
import org.bedu.postwork.javase2project.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Javase2ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(Javase2ProjectApplication.class, args);
	}

}
