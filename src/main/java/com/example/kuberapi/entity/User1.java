package com.example.kuberapi.entity;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.context.annotation.Primary;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@Accessors(chain = true)
public class User1 {
    @Id
    private String id;
    private String name;

    public User1 setName(String name) {
        this.name = name;
        return this;
    }
}
