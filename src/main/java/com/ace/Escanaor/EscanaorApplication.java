package com.ace.Escanaor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class EscanaorApplication {

	public static void main(String[] args) {
		SpringApplication.run(EscanaorApplication.class, args);
	}

}
