package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloNameService {

    @GetMapping(path = "api/hello/{name}")
    public String getHelloName(@PathVariable("name") String name) {
        return "Hello " + name;
    }
}
