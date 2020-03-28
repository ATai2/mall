package com.mall.user.controller;

import com.mall.user.entity.UserEntity;
import com.mall.user.repository.UserPrository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserPrository userPrository;

    @GetMapping("/users")
    public List<UserEntity> getUsers() {
        List<UserEntity> all = userPrository.findAll();
        return all;
    }

    @PostMapping("/user")
    public UserEntity insert(UserEntity userEntity) {
        UserEntity save = userPrository.save(userEntity);
        return save;
    }
}
