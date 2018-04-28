package com.liuzh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * 启动类
 * 此类要在外层目录 否则Spring的依赖注入会失败
 *
 * Created by zhaohong on 2017/10/18.
 */
@SpringBootApplication
@ImportResource({"classpath:velocity.xml"}) // 引入velocity模版
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class);
    }
}
