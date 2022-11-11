package com.ayata.servertest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class URL {
    @GetMapping("/")
    public String home(){
        return "Check Another Check";
    }
}
