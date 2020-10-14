package com.study.layui;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.study.layui.mapper")
public class LayuiApplication {

    public static void main(String[] args) {
        SpringApplication.run(LayuiApplication.class, args);
    }

}
