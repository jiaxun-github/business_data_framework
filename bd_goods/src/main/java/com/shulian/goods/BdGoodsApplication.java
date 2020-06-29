package com.shulian.goods;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.shulian.goods.mapper")
public class BdGoodsApplication {

    public static void main(String[] args) {
        SpringApplication.run(BdGoodsApplication.class, args);
    }

}
