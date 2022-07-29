package com.example.vltask1.service;

import com.example.vltask1.model.User;
import com.example.vltask1.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;

    public void addUser(User user){
        userRepository.save(user);
        System.out.println("Add new  user "+user);
    }
}
