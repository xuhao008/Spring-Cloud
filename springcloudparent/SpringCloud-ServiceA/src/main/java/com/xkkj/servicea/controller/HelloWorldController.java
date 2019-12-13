package com.xkkj.servicea.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: HelloWorldController
 * @author: xuhao
 * @time: 2019/12/12 16:43
 */
@RestController
@RequestMapping("hello")
public class HelloWorldController {

    @GetMapping
    public String hello(){
        System.out.println("欢迎来到Spring Cloud微服务的世界！");
        return "欢迎来到Spring Cloud微服务的世界！";
    }
}
