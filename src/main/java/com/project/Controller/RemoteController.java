package com.project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class RemoteController {
    @GetMapping("")
    public String index() {
        System.out.println("In Remote Controller!");
        return "index";
    }
}
