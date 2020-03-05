package com.funtl.itoken.admin.feign.Servcie.hystrix;

import com.funtl.itoken.admin.feign.Servcie.AdminService;
import org.springframework.stereotype.Component;

@Component
public class AdminServiceHystrix implements AdminService {


    @Override
    public String sayHi(String message) {
        return "request bad mes: "+message;
    }
}
