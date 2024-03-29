package com.example.blog.controller;


import com.example.blog.entity.Result;
import com.example.blog.entity.User;
import com.example.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findById")
    @CrossOrigin
    public User findById(Integer id){
        System.out.println("sss");
        System.out.println(userService.findById(id));
        return userService.findById(id);
    }

    @RequestMapping("/login")
    @CrossOrigin
    public Result login(){
        return Result.success();
    }
}
