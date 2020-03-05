package com.funtl.itoken.admin.feign;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
@EnableAdminServer
public class SpringAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAdminApplication.class);
    }
}
