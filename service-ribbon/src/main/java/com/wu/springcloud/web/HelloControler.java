package com.wu.springcloud.web;

import com.wu.springcloud.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wupeng
 * @version v1.0
 * @create 2017-08-23 10:59
 * @decription ：
 * 1 一个服务注册中心，eureka server,端口为8761
 * 2 service-hi工程跑了两个实例，端口分别为8762,8763，分别向服务注册中心注册
 * 3 sercvice-ribbon端口为8764,向服务注册中心注册
 * 4 当sercvice-ribbon通过restTemplate调用service-hi的hi接口时，因为用ribbon进行了负载均衡，会轮流的调用service-hi：8762和8763 两个端口的hi接口；
 **/
@RestController
@EnableHystrix
@EnableDiscoveryClient
public class HelloControler {
    @Autowired
    HelloService helloService;
    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }

    /**
     * 测试ribbon负载均衡
     * @param name
     * @return
     */
    @RequestMapping(value = "/testRibbon")
    public String TestRibbon(@RequestParam String name){
        return helloService.ribbonTest(name);
    }


}
