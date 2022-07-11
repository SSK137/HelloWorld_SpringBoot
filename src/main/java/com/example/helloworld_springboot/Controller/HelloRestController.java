package com.example.helloworld_springboot.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
    @RequestMapping("/")
    public String hello(){
        return "Hello From Bridgelabz";
    }
}
