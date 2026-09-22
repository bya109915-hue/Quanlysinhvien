package com.example.quanlysinhvien.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String home() {
        return "redirect:/student.html";
    }

    @GetMapping("/students")
    public String viewStudentsPage() {
        return "redirect:/student.html";
    }
}