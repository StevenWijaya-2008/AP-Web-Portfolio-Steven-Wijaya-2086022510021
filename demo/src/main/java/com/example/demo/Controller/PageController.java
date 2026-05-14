package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String index() { return "index"; }

    @GetMapping("/about")
    public String about() { return "about"; }

    @GetMapping("/gallery")
    public String gallery() { return "gallery"; }

    @GetMapping("/contact")
    public String contact() { return "contact"; }
}