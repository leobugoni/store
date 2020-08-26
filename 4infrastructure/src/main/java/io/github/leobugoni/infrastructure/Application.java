package io.github.leobugoni.infrastructure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "io.github.leobugoni")
@EntityScan("io.github.leobugoni")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
