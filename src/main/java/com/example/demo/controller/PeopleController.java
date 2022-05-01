package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PeopleController {

    @GetMapping("/")
    public String hello(Model model) {
        model.addAttribute("hello", "Hello World!");
        return "hello-world";
    }

    @GetMapping("/hello")
    public String helloName(@RequestParam(value = "name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello-name";
    }
}
