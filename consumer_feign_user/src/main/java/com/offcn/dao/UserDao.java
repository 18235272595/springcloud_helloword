package com.offcn.dao;

import com.offcn.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * @Auther: lhq
 * @Date: 2020/10/21 10:29
 * @Description:
 */
@Repository
public class UserDao {

    public User getUserById(Long id){
        User user = new User(id,"张三");
        return user;
    }
}
