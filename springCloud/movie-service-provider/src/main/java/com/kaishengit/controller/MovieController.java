package com.kaishengit.controller;

import com.kaishengit.pojo.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xiaogao on 2017/12/28.
 */
@RestController
public class MovieController {


    @GetMapping("/movie/{id:\\d+}")
    public Movie findById() {
        return new Movie(101,"大话西游","周星驰");
    }
}
