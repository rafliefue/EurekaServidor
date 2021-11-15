package com.everis.bootcamp.eurekaNetflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class EurekaNetflixApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaNetflixApplication.class, args);
	}

}
