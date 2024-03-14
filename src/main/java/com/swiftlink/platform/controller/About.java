package com.swiftlink.platform.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class About{
    @GetMapping("/about")
    public String about(){
        return "SwiftLink";
    }
}