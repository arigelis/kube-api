package com.example.kuberapi.controller;

import com.example.kuberapi.dto.User1Dto;
import com.example.kuberapi.entity.User1;
import com.example.kuberapi.service.User1Service;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user1")
@RequiredArgsConstructor
public class User1Controller {

    private final User1Service user1Service;

    @PostMapping
    public User1 saveUser1(@RequestBody User1Dto user1Dto) {
        return user1Service.saveUser1(user1Dto);
    }

    @GetMapping(path = "getAll")
    public Iterable<User1> getAll() {
        return user1Service.getAll();
    }
}
