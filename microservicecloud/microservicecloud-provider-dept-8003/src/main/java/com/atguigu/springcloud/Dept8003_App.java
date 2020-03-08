package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //开启eureka客户端功能  将该服务注册进eureka服务端
public class Dept8003_App {
	public static void main(String[] args) {
		SpringApplication.run(Dept8003_App.class, args);
	}
}
