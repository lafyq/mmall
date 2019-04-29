package com.mmall.controller;

import com.mmall.pojo.User;
import com.mmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("findUserById")
    public @ResponseBody User findUserById(Integer id) {
        User user = userService.findUserById(id);
        return user;
    }


}
