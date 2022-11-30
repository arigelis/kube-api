package com.example.kuberapi.service;

import com.example.kuberapi.dto.User1Dto;
import com.example.kuberapi.entity.User1;
import com.example.kuberapi.repository.User1Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class User1Service {

    private final User1Repository user1Repository;

    public User1 saveUser1(User1Dto user1Dto) {
        User1 user1 = new User1().setName(user1Dto.getName()).setId(user1Dto.getName());//@Accessors(chain=true)
        return user1Repository.save(user1);
    }

    public Iterable<User1> getAll() {
        return user1Repository.findAll();
    }

}