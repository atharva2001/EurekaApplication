package com.feuji.ServiceTwo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ServiceTwoController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/getServiceOne")
    public String getShow(){
         ResponseEntity<String> responseEntity = restTemplate
                .getForEntity("http://SERVICE-ONE/show/",
                        String.class);
         String res=responseEntity.getBody();
         return  res+" :: I Am In Service Two";
    }
}
