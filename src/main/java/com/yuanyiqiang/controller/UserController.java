package com.yuanyiqiang.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yuanyiqiang.entity.User;
import com.yuanyiqiang.service.UserService;

@Controller  
public class UserController {  
    @Resource  
    private UserService userService;  
      
    @RequestMapping("/")    
    public ModelAndView getIndex(){      
        ModelAndView mav = new ModelAndView("index");   
        User user = userService.getUserById(1);  
        mav.addObject("user", user);   
        return mav;    
    }    
}  