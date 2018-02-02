package com.feign.hystrix.controller;


import com.feign.hystrix.service.HelloService;
import com.feign.hystrix.service.RefactorHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liumapp on 1/21/18.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@RestController
public class ConsumerController {

    @Autowired
    private HelloService helloService;

    @Autowired
    private RefactorHelloService refactorHelloService;


    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
    public String helloConsumer2 (@PathVariable(name = "name") String name) {
        StringBuilder sb = new StringBuilder();
        sb.append(helloService.hello()).append("\n<br>");
        sb.append(helloService.hello(name)).append("\n<br>");
        return sb.toString();
    }
    @RequestMapping(value = "/virtual", method = RequestMethod.GET)
    public String helloConsumer2 () {
        StringBuilder sb = new StringBuilder();
        sb.append("virtual");
        refactorHelloService.virtualFeign();
        return sb.toString();
    }


}
