package com.offcn.controller;

import com.offcn.pojo.User;
import com.offcn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Auther: lhq
 * @Date: 2020/10/21 10:35
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserById")
    public User getUserById(Long id){
        return userService.getUserById(id);
    }


    @RequestMapping("/buyMovie")
    public Map buyMovie(Long userId){
        return userService.buyMovie(userId);
    }
}
