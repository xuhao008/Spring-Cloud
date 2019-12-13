package com.xkkj.serviceb.controller;

import com.xkkj.serviceb.client.HelloworldClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: HelloWorldController
 * @author: xuhao
 * @time: 2019/12/12 17:10
 */
@RestController
public class HelloWorldController {

    @Autowired
    private HelloworldClient helloworldClient;

    @GetMapping("hello")
    public String hello(){
       return helloworldClient.hello();
    }
}
