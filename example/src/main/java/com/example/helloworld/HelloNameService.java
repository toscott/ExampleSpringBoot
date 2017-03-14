package com.example.helloworld;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * A Simple Rest Service to display both a public and a secure hello.
 */
@RestController
public class HelloNameService {

    /**
     * An example of a public hello call where the name is passed in via a path parameter
     * @param name the name of the user to echo
     * @return an echo of "Hello {name}" where name was passed in
     */
    @GetMapping(path = "public/api/hello/{name}")
    public String getPublicHello(@PathVariable("name") String name) {
        return "Hello " + name;
    }

    /**
     * An example of a secure hello call where the name is pulled from the user's context
     * @return an echo of "Hello {name}" where name comes from the security context of the user
     */
    @GetMapping(path = "api/hello")
    public String getSecureHello() {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        return "Hello " + username;
    }
}
