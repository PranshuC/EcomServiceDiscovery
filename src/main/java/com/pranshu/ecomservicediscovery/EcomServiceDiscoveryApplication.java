package com.pranshu.ecomservicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EcomServiceDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcomServiceDiscoveryApplication.class, args);
    }

}
