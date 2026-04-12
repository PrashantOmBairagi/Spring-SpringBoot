package com.first.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Component
@RestController
public class ControllerHome {

    @RequestMapping("/prashant")
    public String test(){
        return "Hello World fucking World !!";
    }
}
