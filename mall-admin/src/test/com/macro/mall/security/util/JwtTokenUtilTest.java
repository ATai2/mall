package com.macro.mall.security.util;

import com.macro.mall.bo.AdminUserDetails;
import com.macro.mall.model.UmsAdmin;
import com.macro.mall.model.UmsResource;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.*;

public class JwtTokenUtilTest {

    private JwtTokenUtil jwtTokenUtil;

    @Before
    public void setUp() throws Exception {
        jwtTokenUtil = new JwtTokenUtil();
        jwtTokenUtil.setExpiration(3000L);
        jwtTokenUtil.setSecret("secret");
        jwtTokenUtil.setTokenHead("head");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getUserNameFromToken() {
        String userNameFromToken = jwtTokenUtil.getUserNameFromToken("SSSS");
        System.out.println(userNameFromToken);

    }

    @Test
    public void validateToken() {
    }

    @Test
    public void generateToken() {
        UmsAdmin umsAdmin = new UmsAdmin();
        umsAdmin.setPassword("pwd");
        umsAdmin.setUsername("name");
        ArrayList<UmsResource> resourceList = new ArrayList<>();
        UmsResource e = new UmsResource();
        e.setId(1L);
        e.setCreateTime(new Date());
        resourceList.add(e);
        String s = jwtTokenUtil.generateToken(new AdminUserDetails(umsAdmin, resourceList));
        System.out.println(s);

    }

    @Test
    public void refreshHeadToken() {
    }
}