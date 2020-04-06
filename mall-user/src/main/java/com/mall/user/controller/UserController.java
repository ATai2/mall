package com.mall.user.controller;

import cn.hutool.json.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mall.user.entity.UserEntity;
import com.mall.user.repository.UserPrository;
import com.mall.user.service.UserService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Api(tags = "UserController", description = "UserController")
@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/users")
    public List<UserEntity> getUsers() {
        log.info("getUser:" );
        return userService.getUsers();
    }
    @GetMapping("/user")
    public List<UserEntity> getUsers(Long id) {
        log.info("getUser:" +id);
        return userService.getUsers();
    }

    @PostMapping("/user")
    public UserEntity insert(@RequestBody UserEntity userEntity) {
        return userService.insert(userEntity);
    }

    @PutMapping("/user")
    public UserEntity update(@RequestBody UserEntity userEntity) {
        return userService.update(userEntity);
    }

    @DeleteMapping("/user")
    public UserEntity delete(@RequestBody UserEntity userEntity) {
        return userService.delete(userEntity);
    }
}
