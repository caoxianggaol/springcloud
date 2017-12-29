package com.kaishengit.controller;

import com.kaishengit.pojo.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    @Autowired  //只解决服务发现1
    private RestTemplate restTemplate;

    @Autowired  //发现服务和负载均衡使用
    private LoadBalancerClient loadBalancerClient;

    /**
     * 与eureka无关 只是一个简单的HTTP请求 与OKHTTP和HTTPclient一样
     * @return
     */
    @GetMapping("/hello")
    public Movie hello() {
        //ServiceInstance 服务实例
        ServiceInstance serviceInstance = loadBalancerClient.choose("MOVIE-SERVICE-PROVIDER");
        //调服务 getForObject get为get请求。然后转成Object 返回是json   serviceInstance.getHost() 获取主机IP
        //加eureka之后 localhost:8080 换成 MOVIE-SERVICE-PROVIDER 更加灵活 只解决服务发现 不解决负载均衡
       return restTemplate.getForObject("http://"+serviceInstance.getHost()+":"+serviceInstance.getPort()+"/movie/101",Movie.class);

    }
}
