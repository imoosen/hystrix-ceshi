package com.feign.hystrix.service;

import com.feign.hystrix.fallback.HelloServiceFallBack;
import org.springframework.cloud.netflix.feign.FeignClient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(value = "demo-client" , fallback = HelloServiceFallBack.class)
public interface HelloService {

    @RequestMapping("/")
    String hello();

    @RequestMapping("/hello1")
    String hello(@RequestParam("name") String name);



}
