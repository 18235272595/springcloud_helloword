package com.offcn.service.impl;

import com.offcn.pojo.Movie;
import com.offcn.service.MovieServiceFeign;
import org.springframework.stereotype.Component;

/**
 * @Auther: lhq
 * @Date: 2020/10/21 14:18
 * @Description:
 */
@Component
public class MovieServiceExceptionFeign implements MovieServiceFeign {
    @Override
    public Movie getNewMovie() {
        Movie movie =  new Movie(-1L,"该电影还没有上映");
        return movie;
    }
}
