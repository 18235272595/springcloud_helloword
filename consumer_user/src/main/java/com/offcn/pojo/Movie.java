package com.offcn.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Auther: lhq
 * @Date: 2020/10/21 10:09
 * @Description:  电影实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie implements Serializable {

    private Long id;
    private String movieName;
}
