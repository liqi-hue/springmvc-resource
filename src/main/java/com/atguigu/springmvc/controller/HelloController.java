package com.atguigu.springmvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: liqi
 * @create 2021-09-20 8:15 PM
 */
@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public String hello(){
        return "Hello SpringMVC";
    }
}
