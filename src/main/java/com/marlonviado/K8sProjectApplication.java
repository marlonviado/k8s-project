package com.marlonviado;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;


@SpringBootApplication
@RestController
@RequestMapping("/test")
@Slf4j
public class K8sProjectApplication {
	
	public static void main(String[] args) {
		Logger log = LoggerFactory.getLogger(K8sProjectApplication.class);
		SpringApplication.run(K8sProjectApplication.class, args);
		log.info("Execute test() method");
	}
	
	@GetMapping
	public String test() {
		log.info("Execute test() method");
		log.info("Hello from Kubernetes Service!");
        return "Hello from Kubernetes Service!";
    }

}
