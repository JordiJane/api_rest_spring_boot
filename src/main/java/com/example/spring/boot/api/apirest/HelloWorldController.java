package com.example.spring.boot.api.apirest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("hello")
    String hello() {
        return "Hello, World!";
    }
}
