package com.offcn.service;

import com.offcn.pojo.User;

import java.util.Map;

/**
 * @Auther: lhq
 * @Date: 2020/10/21 10:30
 * @Description:
 */
public interface UserService {

    public User getUserById(Long id);


    public Map<String,Object> buyMovie(Long userId);
}
