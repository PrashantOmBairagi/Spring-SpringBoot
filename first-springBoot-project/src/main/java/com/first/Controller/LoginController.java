package com.first.Controller;

import com.first.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/")
    public String loginPage(){
        boolean isLogin = loginService.doLogin();
        if(isLogin){
            return "success_login";
        }else return "login";

    }


}
