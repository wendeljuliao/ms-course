package com.devsuperior.hrconfigserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HrConfigServerApplicationTests implements CommandLineRunner {

	@Value("${spring.cloud.config.server.git.username}")
	private String username;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("USERNAME: " + username);
		
	}

}
