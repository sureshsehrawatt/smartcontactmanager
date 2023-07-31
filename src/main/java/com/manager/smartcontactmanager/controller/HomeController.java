package com.manager.smartcontactmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String test(){
        return "home";
    }
    
    @GetMapping("/signup")
    public String signup(Model model){
        model.addAttribute("title", "Signup - Smart Contact Manager");
        return "signup";
    }
    
    @GetMapping("/about")
    public String about(Model model){
        model.addAttribute("title", "About - Smart Contact Manager");
        return "about";
    }
}
