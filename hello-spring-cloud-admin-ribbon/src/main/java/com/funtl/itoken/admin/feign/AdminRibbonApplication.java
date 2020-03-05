package com.funtl.itoken.admin.feign;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableHystrix
@SpringBootApplication
@EnableDiscoveryClient
public class AdminRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminRibbonApplication.class);
    }
}
