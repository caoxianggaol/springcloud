package com.kaishengit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//提供服务
@SpringBootApplication
@EnableDiscoveryClient
public class MovieServiceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieServiceProviderApplication.class, args);
	}
}
