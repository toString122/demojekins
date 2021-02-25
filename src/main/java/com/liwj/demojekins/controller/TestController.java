package com.liwj.demojekins.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {



    @GetMapping("hello")
    public String t1(){
        return "testController";
    }
}
