package com.example.madspild_website.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/frontPage")
    public String frontPage(){
        return "frontPage";
    }
}
