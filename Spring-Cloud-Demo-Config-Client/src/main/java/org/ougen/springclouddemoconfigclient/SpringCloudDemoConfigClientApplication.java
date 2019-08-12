package org.ougen.springclouddemoconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaClient
@EnableDiscoveryClient
public class SpringCloudDemoConfigClientApplication {

    @Value("${server.port}")
    private String port;
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDemoConfigClientApplication.class, args);
    }
    @GetMapping("/getValue")
    public String getValues(){

        return port;
    }
}
