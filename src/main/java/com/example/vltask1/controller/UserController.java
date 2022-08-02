package com.example.vltask1.controller;

import com.example.vltask1.model.User;
import com.example.vltask1.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @GetMapping
    public List<User> getUsers(Model model) {
        List<User> allUser = userService.getAllUser();
        model.addAttribute("about",allUser);
        return allUser;
    }

    @PostMapping
    public ResponseEntity addUser(@RequestBody @Valid User user) {
        userService.addUser(user);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public User getUserByid( @PathVariable Long id) {
        return userService.getUserAbutId(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteByid(@PathVariable Long id) {
        userService.deleteUserByid(id);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
