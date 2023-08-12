package com.example.demo.controllers;

import com.example.demo.constants.Names;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Names sayHello(@RequestParam Names name) {
        return name;
    }

}