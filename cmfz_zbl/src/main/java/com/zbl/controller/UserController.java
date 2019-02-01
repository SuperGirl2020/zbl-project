package com.zbl.controller;

import com.zbl.entity.User;
import com.zbl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2019/2/1 0001.
 */
@Controller
@RequestMapping("/test")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/test")
    public String query(HttpSession session) {
        List<User> users = userService.queryAll();
        session.setAttribute("users", users);
        return "index";
    }

    @RequestMapping("/save")
    public void save(User user) {
        userService.save(user);
    }
}
