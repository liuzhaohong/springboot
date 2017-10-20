package com.liuzh.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by zhaohong on 2017/10/18.
 */
@SpringBootApplication
@ImportResource({"classpath:velocity.xml"})
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class);
    }
}
