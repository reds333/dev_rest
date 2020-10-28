package com.han.webservice.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaySomethingController {

    @GetMapping("/say")
    public String say() {
        return "say hello";
    }
}
