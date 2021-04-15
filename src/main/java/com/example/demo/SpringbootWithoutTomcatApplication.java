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
//11d252b1d060c7744ab6d4b5dce2094d9e
	public static void main(String[] args) {
		SpringApplication.run(SpringbootWithoutTomcatApplication.class, args);
	}

	@RestController
	class GreetingController {
	    
	    @RequestMapping("/hello")
	    String hello(@PathVariable String name) {
<<<<<<< HEAD
	        return "Hello, world data";
=======
	        return "Hello, world data how ";
>>>>>>> branch 'master' of https://github.com/nitinpoosarla/SpringbootExternal.git
	    }
	}
}
