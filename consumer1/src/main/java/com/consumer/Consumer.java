package com.consumer;

import com.api.UserDaoApi;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer start");
        UserDaoApi userDaoApi = context.getBean(UserDaoApi.class);
        System.out.println("consumer");
        System.out.println(userDaoApi.selUser());
    }
}
