package com.funtl.itoken.admin.feign;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@EnableHystrixDashboard
public class AdminFeignApplication {

    public static void main(String[] args) {

        SpringApplication.run(AdminFeignApplication.class,args);

    }
}
