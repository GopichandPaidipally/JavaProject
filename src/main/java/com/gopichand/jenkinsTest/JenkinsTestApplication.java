package com.gopichand.jenkinsTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsTestApplication {
	
	static Logger logger  = LoggerFactory.getLogger(JenkinsTestApplication.class);
	
	@PostConstruct
	public void init() {
		
		logger.info("Application Started now..........");
		
	}

	public static void main(String[] args) {
		logger.info("Application Executed ..........");
		SpringApplication.run(JenkinsTestApplication.class, args);
	}

}
