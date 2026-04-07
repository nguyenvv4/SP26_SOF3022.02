package com.example.sof302202.controller;

import com.example.sof302202.model.User;
import com.example.sof302202.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
// nhận yêu cầu từ trình duyệt

@Controller
public class UserController {
    @Autowired
    UserRepo userRepo;

    @GetMapping("/user")
    public String user() {
     // user user = new user
        List<User> list = userRepo.findAll();
        for (User user : list) {
            System.out.println(user.toString());
        }
        return null;
    }

}
