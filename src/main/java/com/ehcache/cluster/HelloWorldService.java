package com.ehcache.cluster;

import org.springframework.stereotype.Service;

import javax.cache.annotation.CacheResult;

@Service
public class HelloWorldService {

    @CacheResult(cacheName = "genericObjectCache")
    public String sayHello() {
        return "hello";
    }
}
