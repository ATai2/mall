package com.mall.user.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

@Data
@Entity //声明实体类，和数据表映射
@Table(name="tb_user") //指定对应数据表，省略的话默认表名为类名小写
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String password;

    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    private int status;

    @Column(name = "create_time")
    private Date gmtCreate;

    private Date gmtModified;

    @Column(name = "last_login_time")
    private Date lastLoginTime;

    @Column(name = "last_update_time")
    private Date lastUpdateTime;

    private String avatar;

}
