package com.xkkj.servicea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @description: ServiceAApplication
 * @author: xuhao
 * @time: 2019/12/12 15:35
 */
@SpringBootApplication
@EnableEurekaClient
public class ServiceAApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceAApplication.class,args);
    }
}
