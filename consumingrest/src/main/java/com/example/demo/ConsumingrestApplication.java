package com.example.demo;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.example.demo.consumingrest.Quote;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class ConsumingrestApplication {

	// ロガーインスタンスの作成
	private static final Logger log = (Logger) LoggerFactory.getLogger(ConsumingrestApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ConsumingrestApplication.class, args);
	}
	
	// RestTemplate
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> { // Quoteインスタンスを生成しrestTemplateで取得した結果を格納している
			Quote quote = restTemplate.getForObject(
					"http://127.0.0.1:8082/api/random", Quote.class);
			log.info(quote.toString());
		};
	}

}
