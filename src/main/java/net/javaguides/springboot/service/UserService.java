package net.javaguides.springboot.service;

import net.javaguides.springboot.dto.UserDto;
import net.javaguides.springboot.entity.User;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto user);
    UserDto getUerById(Long userId);
    List<UserDto> getAllUsers();

    UserDto updateUser(UserDto user);
    void deleteUser(Long userId);
}
