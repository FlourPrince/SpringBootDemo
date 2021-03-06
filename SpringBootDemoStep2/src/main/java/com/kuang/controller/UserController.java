package com.kuang.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kuang.dao.User;
import com.kuang.service.UserService;

@Controller
public class UserController {
    private static final Logger log = LoggerFactory.getLogger(UserController.class);

	@Autowired
    UserService userService;
    @GetMapping("show")
    //http://localhost:8090/show?xuhao=4
    public List<User> getUser(int xuhao){
        return userService.getUser(xuhao);
    }
    
    @RequestMapping("/test")
    public String test() {
    	log.info("test+++++txt");
    	return "register";
    }
}
