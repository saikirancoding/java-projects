package com.symbiosis.LibraryManagementSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com")
@EntityScan("com.model")
@EnableJpaRepositories(basePackages="com.repositorydao")
public class ProjectLibraryManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectLibraryManagementSystemApplication.class, args);
	}

}
