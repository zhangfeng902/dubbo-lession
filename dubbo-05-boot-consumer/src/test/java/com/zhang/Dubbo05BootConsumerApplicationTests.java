package com.zhang;

import com.zhang.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Dubbo05BootConsumerApplicationTests {

    @DubboReference(url = "dubbo://192.168.0.5:20880/com.zhang.service.UserService")
    private UserService userService;

    @Test
    void contextLoads() {
        boolean ret = userService.login("zhang", "123456");
        System.out.println("-----Dubbo05BootConsumerApplicationTests ret=" + ret);
    }

}
