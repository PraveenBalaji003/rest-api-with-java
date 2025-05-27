package com.mj.books.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @GetMapping("/api")
    public String firstApi(){
        return "Hello, Mj";
    }
}
