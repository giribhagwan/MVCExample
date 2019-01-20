package com.example.MVCExample.controller;

import com.example.MVCExample.domain.User;
import com.example.MVCExample.services.UserServices;
import com.example.MVCExample.services.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserConroller {

    @Autowired
    private UserServices userServices;

    @PostMapping("/")
    public ResponseEntity<User> save(UserDto userDto){
        return ResponseEntity.ok(userServices.save(userDto));
    }
}
