package com.nxin.etpweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.io.InputStream;
import java.util.Properties;

/**
 * Created by zhaohong on 2017/10/18.
 */
@SpringBootApplication
@ImportResource({"classpath:velocity.xml"})
public class Application {

    public static void main(String[] args){
//        SpringApplication app = new SpringApplication(Application.class);
//        app.run(args);
        SpringApplication.run(Application.class);
    }
}
