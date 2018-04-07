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

    /**
     * 测试ribbon负载均衡
     * =====注意：这里请求的是服务名称====
     * 通过之前注入ioc容器的restTemplate来消费service-hi服务的“/hi”接口，
     * 在这里我们直接用的程序名替代了具体的url地址，
     * 在ribbon中它会根据服务名来选择具体的服务实例，
     * 根据服务实例在请求的时候会用具体的url替换掉服务名
     * @param name
     * @return
     */
    public String ribbonTest(String name){
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }
}
