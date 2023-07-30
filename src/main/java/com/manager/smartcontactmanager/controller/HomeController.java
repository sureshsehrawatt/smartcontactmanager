package com.manager.smartcontactmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.manager.smartcontactmanager.dao.UserRepo;
import com.manager.smartcontactmanager.entities.User;

@Controller
public class HomeController {

    @Autowired
    private UserRepo userRepo;
    
    @GetMapping("/test")
    @ResponseBody
    public String test(){
        User user=new User();
        user.setId(1);
        user.setEmail("demo@mail.com");
        userRepo.save(user);
        return "test";
    }
}
