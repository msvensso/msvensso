package com.ocp.sample.rest;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

@RestController
@RequestMapping("/api")
public class HellController {

    @GetMapping("/hello")
    public ResponseEntity sayHello(){
        return new ResponseEntity("Hello World", HttpStatus.OK);
    }
}
