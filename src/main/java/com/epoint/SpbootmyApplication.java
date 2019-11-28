package com.epoint;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan(value="com.epoint.dao")
@SpringBootApplication
public class SpbootmyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpbootmyApplication.class, args);
	}

}
