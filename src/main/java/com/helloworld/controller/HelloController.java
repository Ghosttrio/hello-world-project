package com.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class HelloController {

    @GetMapping
    public String hello() {
        System.out.println("======> hello 요청 성공");
        return "hello";
    }

    @GetMapping("/hello2")
    public String hello2() {
        System.out.println("======> hello2 요청 성공");
        return "hello2";
    }

}
