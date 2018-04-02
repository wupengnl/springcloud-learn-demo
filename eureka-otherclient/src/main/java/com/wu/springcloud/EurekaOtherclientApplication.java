package com.wu.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wupeng
 * @Date 2017.8.23
 * @versoion v1.0
 * @description : 微服务提供者
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaOtherclientApplication {



	public static void main(String[] args) {
		SpringApplication.run(EurekaOtherclientApplication.class, args);
	}

	@Value("${server.port}")
	String port;
	@RequestMapping("/hi")
	public String home(@RequestParam String name) {
		return "hi "+name+",我是小虎 服务提供者，i am from port:" +port;
	}


}
