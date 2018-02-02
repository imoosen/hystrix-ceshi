package com.feign.hystrix.fallback;



import com.feign.hystrix.service.HelloService;
import org.springframework.stereotype.Component;

import org.springframework.web.bind.annotation.RequestParam;


@Component
public class HelloServiceFallBack implements HelloService {
    @Override
    public String hello() {
        return "error";
    }

    @Override
    public String hello(@RequestParam("name") String name) {
        return "unknow name";
    }


}
