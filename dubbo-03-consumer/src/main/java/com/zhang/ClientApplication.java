package com.zhang;

import com.zhang.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

public class ClientApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-consumer.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        boolean retu = userService.login("zhangfeng", "123456");
        System.out.println("------------retu = " + retu);

//        new CountDownLatch(1).await();
        System.in.read();

    }
}