package com.kaishengit.controller;

import com.kaishengit.pojo.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 与eureka无关 只是一个简单的HTTP请求 与OKHTTP和HTTPclient一样
     * @return
     */
    @GetMapping("/hello")
    public Movie hello() {
        //调服务 getForObject get为get请求。然后转成Object 返回是json
       return restTemplate.getForObject("http://localhost:8080/movie/101",Movie.class);

    }
}
