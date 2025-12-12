package com.vale.yuntuku_backend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@MapperScan("com.vale.yuntuku_backend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true) // 开启AOP，允许代理增强
public class YuntukuBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(YuntukuBackendApplication.class, args);
    }

}
