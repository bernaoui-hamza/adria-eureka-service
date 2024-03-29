package org.micros.adriaeurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AdriaEurekaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdriaEurekaServiceApplication.class, args);
    }

}
