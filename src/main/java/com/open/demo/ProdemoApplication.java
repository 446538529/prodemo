package com.open.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.open.demo.mapper")
public class ProdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProdemoApplication.class, args);
    }

}
