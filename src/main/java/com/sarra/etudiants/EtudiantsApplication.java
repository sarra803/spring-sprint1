package com.sarra.etudiants;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.sarra.etudiants.entities.Etudiant;

@SpringBootApplication
public class EtudiantsApplication implements CommandLineRunner {
	
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(EtudiantsApplication.class, args);
		}
		@Override
		public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Etudiant.class);
		}
		}
