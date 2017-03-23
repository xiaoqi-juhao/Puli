package com.puli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PuliApplication {

	@RequestMapping("/")
	public String getStr(){
		return "Hello word!!";
	}
	public static void main(String[] args) {
		SpringApplication.run(PuliApplication.class, args);
	}
}
