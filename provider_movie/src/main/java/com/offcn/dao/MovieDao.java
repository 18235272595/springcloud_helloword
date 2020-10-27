package com.offcn.dao;

import com.offcn.pojo.Movie;
import org.springframework.stereotype.Repository;

/**
 * @Auther: lhq
 * @Date: 2020/10/21 10:11
 * @Description:
 */
@Repository
public class MovieDao {

    public Movie getNewMovie() {
        Movie movie = new Movie(1L, "我和我的家乡");
        return movie;
    }
}
