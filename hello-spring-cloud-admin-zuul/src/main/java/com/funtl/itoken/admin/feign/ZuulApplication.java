package com.funtl.itoken.admin.feign;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ZuulApplication {

    public static void main(String[] args) {

        SpringApplication.run(ZuulApplication.class,args);

    }
}
