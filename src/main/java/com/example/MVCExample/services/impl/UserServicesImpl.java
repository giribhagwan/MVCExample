package com.example.MVCExample.services.impl;

import com.example.MVCExample.domain.User;
import com.example.MVCExample.repository.UserRepository;
import com.example.MVCExample.services.UserServices;
import com.example.MVCExample.services.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServicesImpl implements UserServices {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(UserDto userDto) {return userRepository.save(new User(userDto.getName(),userDto.getAddress(),userDto.getPassword()));}
}
