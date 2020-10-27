package com.offcn.service;

import com.offcn.pojo.Movie;
import com.offcn.service.impl.MovieServiceExceptionFeign;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Auther: lhq
 * @Date: 2020/10/21 11:35
 * @Description:
 */
@FeignClient(value = "PROVIDERMOVIE",fallback = MovieServiceExceptionFeign.class)    //远程调用的服务ID
public interface MovieServiceFeign {

    @GetMapping("/movie/getNewMovie")   //服务提供者提供服务
    public Movie getNewMovie();
}
