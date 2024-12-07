package com.groupeisi.ms2.web.rest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/v1/")
public class HelloController {

    @GetMapping("hello")
    public String sayHello() {
        return "Hello I am ms2 !";
    }
}
