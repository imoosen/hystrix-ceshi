package com.feign.hystrix.service;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(value = "demo-client2")
public interface RefactorHelloService{
    @RequestMapping(value = "/virtual",method = RequestMethod.GET)
    public void virtualFeign();
}
