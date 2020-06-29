package com.shulian.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BdGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(BdGatewayApplication.class, args);
    }

}
