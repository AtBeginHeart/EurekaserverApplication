package com.example.urekaerver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class UrekaerverApplication {

	public static void main(String[] args) {
		SpringApplication.run(UrekaerverApplication.class, args);
	}
}
