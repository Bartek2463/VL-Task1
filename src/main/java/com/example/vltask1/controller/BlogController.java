package com.example.vltask1.controller;

import com.example.vltask1.model.Blog;
import com.example.vltask1.model.User;
import com.example.vltask1.service.BlogService;
import com.example.vltask1.service.UserService;
import lombok.AllArgsConstructor;
import org.apache.catalina.LifecycleState;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/blog")
public class BlogController {

    private UserService userService;
    private BlogService blogService;

    @GetMapping
    public List<Blog> getAllBlog() {
        return blogService.getAllBlog();
    }

    @GetMapping("/add")
    public List<User> getAddBlog() {
        return userService.getAllUser();
    }

    @PostMapping
    public ResponseEntity addBlog(@Valid Blog blog) {
        blogService.addBlog(blog);
        return new ResponseEntity(HttpStatus.CREATED);
    }

}
