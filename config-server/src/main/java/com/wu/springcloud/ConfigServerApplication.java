package com.wu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wupeng
 * @version v1.0
 * @create 2017-08-23 15:13
 * @decription 配置服务器服务端
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer //开启配置服务器
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}
