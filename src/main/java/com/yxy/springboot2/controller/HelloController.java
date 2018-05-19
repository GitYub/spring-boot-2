package com.yxy.springboot2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("/sayhello.html")
    public @ResponseBody String say() {

        return "Hello Spring Boot";

    }
}
