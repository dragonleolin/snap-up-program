package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication
//@ComponentScan(basePackages = "com.example.demo")
//@MapperScan("com.example.demo.mapper")
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class DemoMyBatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMyBatisApplication.class, args);
	}

}
