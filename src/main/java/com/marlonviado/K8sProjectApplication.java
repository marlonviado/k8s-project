package com.marlonviado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/test")
public class K8sProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(K8sProjectApplication.class, args);
	}
	
	@GetMapping
	public String test() {
        return "Hello from Kubernetes Service!";
    }

}
