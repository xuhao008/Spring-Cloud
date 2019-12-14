package com.xkkj.serviceb.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @description: HelloworldClient
 * @author: xuhao
 * @time: 2019/12/12 17:08
 */

@FeignClient("Service-A")
public interface HelloworldClient {

    @GetMapping("hello")
    public String hello();
}
