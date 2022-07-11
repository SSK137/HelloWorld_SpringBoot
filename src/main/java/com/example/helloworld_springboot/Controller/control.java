package com.example.helloworld_springboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class control {
    @GetMapping("/web")
    public String Hello(){
        return "hello";
    }
    @GetMapping("/web/messsage")
    public String message(Model model){
        model.addAttribute("message","This is a custom message");
        return "message";
    }
}
