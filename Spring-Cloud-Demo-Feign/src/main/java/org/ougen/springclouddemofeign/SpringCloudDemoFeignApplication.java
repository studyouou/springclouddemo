package org.ougen.springclouddemofeign;

import org.ougen.springclouddemofeign.feign.OwnFeignClient;
import org.ougen.springclouddemofeign.service.impl.FeignServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
@EnableFeignClients
public class SpringCloudDemoFeignApplication {

    @Autowired
    private FeignServiceImpl feignService;

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDemoFeignApplication.class, args);
    }

    @GetMapping("/hiDemo")
    public String feignHi(){
        return "这是feign接口,"+feignService.hihihihi();
    }
}
