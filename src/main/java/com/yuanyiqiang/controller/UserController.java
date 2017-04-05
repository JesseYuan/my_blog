package com.yuanyiqiang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yuanyiqiang.entity.User;
import com.yuanyiqiang.service.UserService;

@Controller
public class UserController {  
    @Autowired  
    private UserService userService;  
      
    @RequestMapping("/login")    
    public String login(String userName, String password) {
        return "redirect:https://www.baidu.com";
    }
}  