package com.example.MVCExample.services;

import com.example.MVCExample.domain.User;
import com.example.MVCExample.services.dto.UserDto;

public interface UserServices {

    User save(UserDto userDto);
}
