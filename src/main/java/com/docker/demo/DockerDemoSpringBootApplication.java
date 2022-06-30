package com.docker.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerDemoSpringBootApplication {

	@GetMapping
	public String getMassege() {
		return "Hello mahesh";
	}
	public static void main(String[] args) {
		SpringApplication.run(DockerDemoSpringBootApplication.class, args);
	}

}
