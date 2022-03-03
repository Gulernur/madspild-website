package com.example.madspild_website.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping()
    public String frontPage(){
        return "frontPage";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }

    @GetMapping("/courses")
    public String courses(){
        return "courses";
    }

    @GetMapping("/attendEvent")
    public String attendEvent(){
        return "attendEvent";
    }

    @GetMapping("/joinMovement")
    public String joinMovement(){
        return "joinMovement";
    }
}
