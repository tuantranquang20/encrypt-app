package com.example.informationsecurity.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin
@RequestMapping("/api/test")
public class TestController {
    @GetMapping("/all")
    public ResponseEntity<String> allAcess(){

        return  ResponseEntity.ok("public content");
    }

}
