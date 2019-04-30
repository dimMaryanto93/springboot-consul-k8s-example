package com.maryanto.dimas.example.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DiscoveryServiceExample {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServiceExample.class, args);
	}

}
