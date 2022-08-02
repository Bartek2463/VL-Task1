package com.example.vltask1.controller;

import com.example.vltask1.model.User;
import com.example.vltask1.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.net.http.HttpResponse;
import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @GetMapping
    public List<User> getUsers(){
        return userService.getAllUser();
    }

    @PostMapping
    public ResponseEntity addUser(@Valid User user){
        userService.addUser(user);
        return new ResponseEntity(HttpStatus.CREATED);
    }





}
