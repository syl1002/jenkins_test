package com.ls.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author LiShuai
 * @Date 2020/5/12 13:07
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Value("${env.id}")
    private String id;

    @Value("${env.name}")
    private String name;

    @GetMapping("/test2")
    public Object test2(int num){
        if (num==1) {
            return id;
        } else if (num==2) {
            return name;
        }
        return null;
    }

}
