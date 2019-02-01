package com.zbl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Administrator on 2019/2/1 0001.
 */
@SpringBootApplication
@MapperScan("com.zbl.dao")
public class CmfzApp {
    public static void main(String[] args) {
        SpringApplication.run(CmfzApp.class);
    }
}
