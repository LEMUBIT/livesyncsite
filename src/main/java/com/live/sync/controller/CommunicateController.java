package com.live.sync.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommunicateController {

    @GetMapping("/hello")
    String helloLive(){
        return "We are live";
    }
}
