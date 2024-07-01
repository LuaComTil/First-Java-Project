package com.lfr.investments.controller;

import com.lfr.investments.entity.User;
import com.lfr.investments.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/v1/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody CreateUserDto CreateUserDto) {
        var userId = userService.createUser(CreateUserDto);
        return ResponseEntity.created(URI.create("/v1/users/" + userId)).build();
    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable("userId") String userId) {
        return null;
    }
}
