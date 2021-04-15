package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class SpringbootWithoutTomcatApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWithoutTomcatApplication.class, args);
	}

	@RestController
	class GreetingController {
	    
	    @RequestMapping("/hello")
	    String hello(@PathVariable String name) {
	        return "Hello, ";
	    }
	}
}
