package com.jy.controller.user;

import com.jy.model.user.User;
import com.jy.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("insert")
    String insertUser(User user) {
        userService.insert(user);
        return "index";
    }
}
