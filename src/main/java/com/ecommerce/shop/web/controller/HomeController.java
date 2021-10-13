package com.ecommerce.shop.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    public String HomeController;

    @GetMapping("/say-hello")
    public @ResponseBody String getHomeController(){
        return "Welcome to my first spring application";
    }
}
