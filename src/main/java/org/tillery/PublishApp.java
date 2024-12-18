package org.tillery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="org.tillery")  // This annotation combines @Configuration, @EnableAutoConfiguration, and @ComponentScan
public class PublishApp {

    public static void main(String[] args) {
        SpringApplication.run(PublishApp.class, args);
    }
}