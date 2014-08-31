package be.daggie.microservices.async;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class PersonPublisherApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(PersonPublisherApplication.class, args);
    }
}
