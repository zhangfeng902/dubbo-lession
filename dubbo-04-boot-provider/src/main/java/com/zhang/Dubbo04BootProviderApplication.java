package com.zhang;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
//@DubboComponentScan(basePackages = {"com.zhang.service"})
public class Dubbo04BootProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(Dubbo04BootProviderApplication.class, args);
    }

}
