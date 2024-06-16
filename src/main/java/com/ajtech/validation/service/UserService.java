package com.ajtech.validation.service;

import com.ajtech.validation.entity.User;
import com.ajtech.validation.exception.UserNotFoundException;
import com.ajtech.validation.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User saveUSer(User user){
        return userRepository.save(user);
    }

    public List<User> getAllUser(){
       return  userRepository.findAll();
    }

    public User getUserById(int id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User not found"));
    }

    public void deleteUserById(int id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User not found"));
        userRepository.deleteById(id);
    }


}
