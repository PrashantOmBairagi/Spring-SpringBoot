package com.first.controller;

import com.first.services.LoginService;
import com.first.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @Autowired
    private ProductService productService;


    @RequestMapping("/")
    public String loginPage(){
        productService.createProduct();
        boolean isLogin = loginService.doLogin();
        if(isLogin){
            return "success_login";
        }else return "login";

    }


}
