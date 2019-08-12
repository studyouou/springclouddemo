package org.ougen.springclouddemoregister;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudDemoRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDemoRegisterApplication.class, args);
    }

}
