package com.xkkj.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @description: EureKaApplication 项目启动类
 * @author: xuhao
 * @time: 2019/12/12 14:51
 */

@SpringBootApplication
@EnableEurekaServer
public class EureKaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EureKaApplication.class,args);
    }
}
