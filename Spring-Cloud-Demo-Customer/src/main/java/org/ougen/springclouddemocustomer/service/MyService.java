package org.ougen.springclouddemocustomer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Author: OuGen
 * Discription:
 * Date: 19:35 2019/7/29
 */
@Service
public class MyService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "failtoCall")
    public String hihi(){
        return restTemplate.getForObject("http://client/hiDemo",String.class);
    }

    public String failtoCall(){
        return "it error, please wait a miniter";
    }
}
