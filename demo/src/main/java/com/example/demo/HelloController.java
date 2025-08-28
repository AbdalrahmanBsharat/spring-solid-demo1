package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {
    @GetMapping("/hello")
    String hello() { return "Hello, bsh 👋 (Spring Boot 3 / Java 21)"; }
}
