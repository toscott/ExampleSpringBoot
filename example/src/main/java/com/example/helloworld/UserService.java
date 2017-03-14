package com.example.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jkurtz on 3/14/2017.
 */
@RestController
public class UserService {

    @Autowired
    UserRepository userRepository;

    @GetMapping(path = "public/api/hello/user/{id}")
    public String getPublicUser(@PathVariable("id") Integer id) {
        User user = userRepository.findUserById(id);
        return "Hello " + user.getName();
    }
}
