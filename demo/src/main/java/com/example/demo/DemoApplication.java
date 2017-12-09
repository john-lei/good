package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@SpringBootApplication
@EnableScheduling
public class DemoApplication {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	private final String  templateStr = "Hello, %s ! Welcome to Spring Boot...";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/greeting")
	public User greeting(@RequestParam(value = "name",defaultValue = "World") String name){
		logger.info("## Info  Information ##: {}", name);
		logger.warn("## Warn  Information ##: {}", name);
		logger.error("## Error Information ##: {}", name);
		return new User(counter.incrementAndGet(),String.format(templateStr,name));
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
