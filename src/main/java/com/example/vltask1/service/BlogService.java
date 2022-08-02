package com.example.vltask1.service;

import com.example.vltask1.model.Blog;
import com.example.vltask1.model.User;
import com.example.vltask1.repository.BlogRepository;
import com.example.vltask1.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BlogService {

    private BlogRepository blogRepository;
    private UserService userService;

    public List<Blog> getAllBlog (){
        return blogRepository.findAll();
    }


    public void addBlog(Blog blog){
        blogRepository.save(blog);
    }


    public void deleteBlogById(Long id){
        blogRepository.deleteById(id);
        System.out.println("Delete blog number id "+id);
    }

}
