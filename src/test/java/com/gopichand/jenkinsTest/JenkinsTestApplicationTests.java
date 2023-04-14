package com.gopichand.jenkinsTest;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsTestApplicationTests {
	
	Logger logger =  LoggerFactory.getLogger(JenkinsTestApplicationTests.class);

	@Test
	public void contextLoads() {
		logger.info("Executing test class......");
		assertNotEquals(true, true);
	}

}
