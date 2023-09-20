package com.ace.Escanaor.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Landing {
    @GetMapping("/")
    public String error(){
        return "<h1>Error</h1>";
    }
}
