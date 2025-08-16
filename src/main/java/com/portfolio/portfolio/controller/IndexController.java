package com.portfolio.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public  String index(){
        return "index";
    }

    @GetMapping("/overwatch")
    public  String overwatch(){
        return "project/overwatch";
    }
}
