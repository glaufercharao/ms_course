package com.devsuperior.hrpayroll.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Configuration
@Component
public class AppConfig {
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
