package com.hiram.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hiram.dubbo.api.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Reference
    private DemoService demoService;

    @GetMapping("/index")
    public String index(){
        return demoService.sayHello("ldh");
    }
}
