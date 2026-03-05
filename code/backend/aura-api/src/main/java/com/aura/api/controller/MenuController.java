package com.aura.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuController {

    @GetMapping("/menu")
    public String menu() {
        return "Menu API working";
    }
}