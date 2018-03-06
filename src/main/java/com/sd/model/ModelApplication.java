package com.sd.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ModelApplication {
	@Bean
	public RestTemplate template(){
		return new RestTemplate();
	}
	public static void main(String[] args) {
		SpringApplication.run(ModelApplication.class, args);
	}
}
