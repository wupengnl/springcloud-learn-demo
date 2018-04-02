package com.wu.springcloud.service.impl;

import com.wu.springcloud.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wupeng
 * @version v1.0
 * @create 2017-08-23 14:10
 * @decription 断路由设置
 **/
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "fegin断路由发挥作用，sorry 服务不可用 "+name;
    }




}
