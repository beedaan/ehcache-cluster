package com.ehcache.cluster;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(value = "hello", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getData() {
        return "Hello";
    }
}
