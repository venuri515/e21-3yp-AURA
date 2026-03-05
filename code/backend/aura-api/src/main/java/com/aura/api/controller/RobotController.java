package com.aura.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RobotController {

    @GetMapping("/robot/status")
    public String robotStatus() {
        return "AURA robot backend running";
    }
}