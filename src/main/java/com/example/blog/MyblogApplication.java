package com.example.blog;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyblogApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyblogApplication.class, args);
		String x="vikas";
		int x=100;
	}
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
