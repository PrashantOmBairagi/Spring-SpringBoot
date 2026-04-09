package com.first.Controller;

import org.springframework.stereotype.Component;
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
