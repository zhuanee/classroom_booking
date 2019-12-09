package com.network.booking.controller;


import com.network.booking.entities.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.*;

@RestController
public class TestController {
    @GetMapping("/user")
    public User getUser() {
        return new User( "倪升武", 1);
    }

    @GetMapping("/list")
    public List<User> getUserList() {
        List<User> userList = new ArrayList<>();
        User user1 = new User( "倪升武", 1);
        User user2 = new User( "达人课", 1);
        userList.add(user1);
        userList.add(user2);
        return userList;
    }

    @GetMapping("/map")
    public Map<String, Object> getMap() {
        Map<String, Object> map = new HashMap<>();
        User user = new User("倪升武", 1);
        map.put("作者信息", user);
        map.put("博客地址", "http://blog.itcodai.com");
        map.put("CSDN地址", "http://blog.csdn.net/eson_15");
        map.put("粉丝数量", 4153);
        return map;
    }
}
