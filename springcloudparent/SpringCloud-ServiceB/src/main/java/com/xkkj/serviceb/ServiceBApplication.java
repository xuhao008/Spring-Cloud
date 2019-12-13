package com.xkkj.serviceb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description: ServiceBApplication
 * @author: xuhao
 * @time: 2019/12/12 15:36
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ServiceBApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceBApplication.class,args);
    }
}
