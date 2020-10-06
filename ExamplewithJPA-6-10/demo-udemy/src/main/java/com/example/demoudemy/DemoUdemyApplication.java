package com.example.demoudemy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;


@SpringBootApplication(scanBasePackages={"com.example.demoudemy"})
@EnableJpaRepositories ("com.example.demoudemy.repository")
public class DemoUdemyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoUdemyApplication.class, args);
	}

}
