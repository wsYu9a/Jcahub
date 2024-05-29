package com.jcahub;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@ServletComponentScan
@SpringBootApplication
@MapperScan("com.jcahub.mapper")
public class SqlInjectionApplication {
    public static void main(String[] args) {
        SpringApplication.run(SqlInjectionApplication.class, args);
    }

}
