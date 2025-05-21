package com.example.eventapp.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @GetMapping("/test")
    String test(HttpServletRequest request) {
        return request.getSession().getId();
                 }
}
