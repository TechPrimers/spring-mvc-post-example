package com.techprimers.springmvcpostexample.resource;

import com.techprimers.springmvcpostexample.model.User;
import com.techprimers.springmvcpostexample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/user")
public class UserResource {

    @Autowired
    UserService userService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,
    consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<User> create(@RequestBody final User user){
        userService.create(user);
        return userService.getAll();
    }

    @GetMapping
    public List<User> getAll() {
        return userService.getAll();
    }
}
