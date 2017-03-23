package com.mdmotion;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;


@RestController
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan
public class DBApplication {

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DBApplication.class, args);
	}
}
