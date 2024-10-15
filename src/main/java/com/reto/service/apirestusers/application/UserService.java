package com.reto.service.apirestusers.application;

import com.reto.service.apirestusers.domain.dto.user.UserDto;

import java.util.UUID;

public interface UserService {
    UserDto createUser(UserDto userDto);
    UserDto showUser(UUID userId);
    UserDto updateUser(UUID userId, UserDto userDto);
    void deleteUser(UUID userId);
}
