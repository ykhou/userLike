package com.kang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.yhy.like.mapper")
@SpringBootApplication
public class LikeApplication {

	public static void main(String[] args) {
		SpringApplication.run(LikeApplication.class, args);
	}

}
