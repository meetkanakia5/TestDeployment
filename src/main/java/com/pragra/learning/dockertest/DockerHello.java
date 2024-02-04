package com.pragra.learning.dockertest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class DockerHello {
    @GetMapping
    public String name() {
        return "DOcker!";
    }
}
