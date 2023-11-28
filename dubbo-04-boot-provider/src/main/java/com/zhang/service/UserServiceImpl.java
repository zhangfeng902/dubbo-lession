package com.zhang.service;

import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class UserServiceImpl implements UserService{
    @Override
    public boolean login(String name, String password) {
        System.out.println("------DUBBO-04-BOOT-PROVIDER name:" + name + " password:"+password);
        return false;
    }
}
