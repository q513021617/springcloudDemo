package com.funtl.itoken.admin.feign.Servcie;

import com.funtl.itoken.admin.feign.Servcie.hystrix.AdminServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//fallback =

@FeignClient(value = "HELLO-SPRING-CLOUD-SERVICE-ADMIN",fallback = AdminServiceHystrix.class)
public interface AdminService {


    @RequestMapping(value = "hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam(value = "message") String message);


}
