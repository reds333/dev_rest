package com.han.webservice.springboot.web;

import com.han.webservice.springboot.web.dto.ResponseDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaySomethingController {

    @GetMapping("/say")
    public String say() {
        return "say hello";
    }

    @GetMapping("/say/dto")
    public ResponseDTO helloDto(@RequestParam("name") String name,
                                @RequestParam("amount") int amount) {
        return new ResponseDTO(name, amount);
    }
}
