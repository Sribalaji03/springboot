package com.tamilarsi.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Restcontrolers {
    @GetMapping("/")
    public String welcome() {
        return "Tamilarasi Technologies";
    }
}
