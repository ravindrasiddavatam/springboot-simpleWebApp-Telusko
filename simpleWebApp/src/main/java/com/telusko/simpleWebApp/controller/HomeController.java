package com.telusko.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    @ResponseBody
    public String greet() {
      return "Welcome to Telusko!!!";
    }

    @RequestMapping("/about")
    public String about() {
        return "We don't teach, we educate!!!";
    }
}
