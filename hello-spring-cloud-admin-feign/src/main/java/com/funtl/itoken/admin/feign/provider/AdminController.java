package com.funtl.itoken.admin.feign.provider;

import com.funtl.itoken.admin.feign.Servcie.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Autowired
    AdminService adminService;


    @RequestMapping(value = "hi",method = RequestMethod.GET)
    public String sayHai(String message){

        return adminService.sayHi(message);
    }
}
