package com.mall.user.repository;

import com.mall.user.entity.UserEntity;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserPrositoryTest {
    @Autowired
    UserPrository userPrository;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void insert(){
        UserEntity userEntity=new UserEntity();
        userEntity.setAvatar("avater");
        userEntity.setName("name");

        userPrository.saveAndFlush(userEntity);
    }

    @After
    public void tearDown() throws Exception {
    }
}