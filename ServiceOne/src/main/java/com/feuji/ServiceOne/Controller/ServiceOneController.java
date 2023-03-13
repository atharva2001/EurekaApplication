package com.feuji.ServiceOne.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceOneController {

    @GetMapping("/show")
    public String show(){
        return "Hello I Am Service One";
    }
}
