package com.example.vltask1.service;

import com.example.vltask1.model.User;
import com.example.vltask1.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;

    public void addUser(User user) {
        userRepository.save(user);
        System.out.println("Add new  user " + user);
    }

    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    public User getUserAbutId(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public void deleteUserByid(Long id) {
        userRepository.deleteById(id);
    }
}
