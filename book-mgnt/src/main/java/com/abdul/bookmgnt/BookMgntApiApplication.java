package com.abdul.bookmgnt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BookMgntApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookMgntApiApplication.class, args);
	}

}
