package com.pigasso;

import com.pigasso.mapper.UserMapper;
import com.pigasso.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest // SpringBoot 整合单元类测试的注解
class Springboot0MybatisQuickstartApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testListUser(){
        List<User> userList = userMapper.list();
        userList.stream().forEach(System.out::println);
    }

}
