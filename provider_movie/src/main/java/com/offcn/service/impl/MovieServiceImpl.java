package com.offcn.service.impl;

import com.offcn.dao.MovieDao;
import com.offcn.pojo.Movie;
import com.offcn.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Auther: lhq
 * @Date: 2020/10/21 10:14
 * @Description:
 */
@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieDao movieDao;

    @Value("${server.port}")
    private String port;

    @Override
    public Movie getNewMovie() {
        System.out.println("port:"+port);
        return movieDao.getNewMovie();
    }
}
