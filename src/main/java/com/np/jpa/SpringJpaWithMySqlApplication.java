package com.np.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.np.jpa.repository")
public class SpringJpaWithMySqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaWithMySqlApplication.class, args);
	}
	
	

}
