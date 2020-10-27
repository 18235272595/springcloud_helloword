package com.offcn.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.offcn.dao.UserDao;
import com.offcn.pojo.Movie;
import com.offcn.pojo.User;
import com.offcn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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
    private RestTemplate restTemplate;


    @Override
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }

    @Override
    @HystrixCommand(fallbackMethod = "buyMovieFallbackMethod")
    public Map<String, Object> buyMovie(Long userId) {
        Map<String, Object> resultMap = new HashMap<>();
        //1.根据userId查询用户对象
        User user = this.getUserById(userId);
        //2.远程调用电影服务接口查询电影对象
        Movie movie = restTemplate.getForObject("http://PROVIDERMOVIE/movie/getNewMovie", Movie.class);
        //3.设置map
        resultMap.put("user", user);
        resultMap.put("movie", movie);
        return resultMap;
    }

    //触发熔断后做降级处理的方法 ，原则，参数和放回类型要与原方法保持一致
    public Map<String, Object> buyMovieFallbackMethod(Long userId) {
        Map<String, Object> resultMap = new HashMap<>();
        User user = new User(-1L,"查无此用户");
        Movie movie = new Movie(-1L,"该电影还没有上映");
        resultMap.put("user",user);
        resultMap.put("movie",movie);
        return resultMap;
    }
}
