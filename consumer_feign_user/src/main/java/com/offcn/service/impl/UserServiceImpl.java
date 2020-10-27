package com.offcn.service.impl;

import com.offcn.dao.UserDao;
import com.offcn.pojo.Movie;
import com.offcn.pojo.User;
import com.offcn.service.MovieServiceFeign;
import com.offcn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: lhq
 * @Date: 2020/10/21 10:31
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private MovieServiceFeign movieServiceFeign;


    @Override
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }

    @Override
    public Map<String, Object> buyMovie(Long userId) {
        Map<String, Object> resultMap = new HashMap<>();
        //1.根据userId查询用户对象
        User user = this.getUserById(userId);
        //2.远程调用电影服务接口查询电影对象
        Movie movie = movieServiceFeign.getNewMovie();
        //3.设置map
        resultMap.put("user", user);
        resultMap.put("movie", movie);
        return resultMap;
    }
}
