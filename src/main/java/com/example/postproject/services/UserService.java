package com.example.postproject.services;

import com.example.postproject.models.User;
import com.example.postproject.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    public User createUser(User user){
        return(userRepository.save(user));
    }
}
