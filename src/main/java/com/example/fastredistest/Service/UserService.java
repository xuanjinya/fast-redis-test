package com.example.fastredistest.Service;

import com.example.fastredistest.entity.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Cacheable(cacheNames = "user")
    public User queryUser() {
        System.out.println("模拟执行了数据库查询");
        User user = new User(1, "admin");
        return user;
    }
}
