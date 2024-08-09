package com.example.blog;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
@SpringBootApplication
public class MyblogApplication {
  
	String v="mahi";

	private static final String REST_URL="https://www.equifix.com/getScore";


	public static void main(String[] args) {
		SpringApplication.run(MyblogApplication.class, args);
		String x="vikas";
	}
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
