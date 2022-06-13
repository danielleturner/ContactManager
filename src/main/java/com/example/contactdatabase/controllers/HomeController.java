package com.example.contactdatabase.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {


    @GetMapping("/home/{name}")
    public String home(@PathVariable String name, Model model){
        model.addAttribute("name", name);
        return "/home";
    }


    @GetMapping("/join")
    public String showJoinForm(){
        return "join";
    }

    @PostMapping("/join")
    public String joinGroup(@RequestParam(name = "group") String group, Model model){
        model.addAttribute("group", "Welcome to " + group + "!");
        return "join";
    }

}
