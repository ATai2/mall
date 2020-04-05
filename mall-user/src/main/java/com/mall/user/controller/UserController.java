package com.mall.user.controller;

import com.mall.user.entity.UserEntity;
import com.mall.user.repository.UserPrository;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "UserController", description = "UserController")
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
    public UserEntity insert(@RequestBody UserEntity userEntity) {
        UserEntity save = userPrository.save(userEntity);
        return save;
    }

    @PutMapping("/user")
    public UserEntity update(@RequestBody UserEntity userEntity) {
        UserEntity entity = userPrository.saveAndFlush(userEntity);
        return entity;
    }

    @DeleteMapping("/user")
    public UserEntity delete(@RequestBody UserEntity userEntity) {
        UserEntity entity = userEntity;
        userPrository.delete(entity);
        return entity;
    }
}
