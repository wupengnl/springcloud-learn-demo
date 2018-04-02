package com.wu.springcloud.service;//package com.wu.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author wupeng
 * @version v1.0
 * @create 2017-08-23 10:58
 * @decription
 **/
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    /** @HystrixCommand添加断路由 **/
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }

    public String hiError(String name) {
        return "hi,"+name+",ribbo 的断路由发挥作用 ，sorry,error!";
    }
}
