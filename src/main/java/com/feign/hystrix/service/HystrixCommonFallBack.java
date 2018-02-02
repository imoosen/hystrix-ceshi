package com.feign.hystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Component;

/**
 * Created by mengsen on 2018/2/1.
 *
 * @Description: [一句话描述该类的功能]
 * @UpdateUser: mengsen on 2018/2/1.
 */
@Component
public class HystrixCommonFallBack {

    @HystrixCommand
    public String hiError() {
        return "hi,sorry,error!";
    }
}
