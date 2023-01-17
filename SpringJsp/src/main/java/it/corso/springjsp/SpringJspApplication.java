package it.corso.springjsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class SpringJspApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJspApplication.class, args);
    }

}
