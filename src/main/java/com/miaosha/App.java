package com.miaosha;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 */
//开启spring 的自动化配置主要处理依赖
@SpringBootApplication(scanBasePackages = "com.miaosha")
@RestController
//扫描dao
@MapperScan("com.miaosha.dao")
public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        SpringApplication.run(App.class);
    }
}
