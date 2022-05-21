package com.example.npspring5tutorialnewproject.contollers;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloContoller {
    @RequestMapping("/hello")
    public String hello() {

        return "Hello,world ";
    }
}