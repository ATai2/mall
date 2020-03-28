package com.mall.user.repository;

import com.mall.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface UserPrository extends JpaRepository<UserEntity, Long> {


}
