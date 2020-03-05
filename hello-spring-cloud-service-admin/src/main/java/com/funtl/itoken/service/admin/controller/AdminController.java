package com.funtl.itoken.service.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Value("${server.port}")
    private String port;
    @RequestMapping(value = "hi",method = RequestMethod.GET)
    public String sayHai(String message){
        return "信息: "+message+"端口: "+port;
    }
}
