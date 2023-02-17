package com.encora.splittrip.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2")
public class MainController {

    @Value("${app.version}")
    private String APP_VERSION;
    @GetMapping("/version")
    public String showAPIVersion() {
        return this.APP_VERSION;
    }
}
