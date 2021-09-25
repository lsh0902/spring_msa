package com.example.ecommerceM;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EcommerceMApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceMApplication.class, args);
	}

}
