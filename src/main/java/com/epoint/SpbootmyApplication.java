package com.epoint;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//批量扫描dao接口
@MapperScan("com.epoint.dao")
@SpringBootApplication
public class SpbootmyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpbootmyApplication.class, args);
	}

}
