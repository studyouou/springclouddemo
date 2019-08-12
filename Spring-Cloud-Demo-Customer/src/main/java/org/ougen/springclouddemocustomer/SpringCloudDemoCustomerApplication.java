package org.ougen.springclouddemocustomer;

import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.ougen.springclouddemocustomer.service.MyService;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
@EnableHystrix
public class SpringCloudDemoCustomerApplication {
    @Autowired
    private MyService myService;

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDemoCustomerApplication.class, args);
    }
    @GetMapping("/hiDemo")
    public String demo1(){
        return "这是ribbon接口,"+myService.hihi();
    }
    @LoadBalanced
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
