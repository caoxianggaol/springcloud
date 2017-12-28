package com.kaishengit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MovieServiceConsumerApplication {

	@Bean    //放入Bean容器并声明RestTemplate后controller中可以使用
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(MovieServiceConsumerApplication.class, args);
	}
}
