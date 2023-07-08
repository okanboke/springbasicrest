package com.spring.restapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {

    @GetMapping("/")
    public String get() {
        return "Ürün1";
    }

    @GetMapping("/product")
    public String get2() {
        return "Ürün2";
    }
}
