package com.blog.zhengblog.entity;

import lombok.Data;
import java.time.LocalDateTime;
import  java.util.Date;

/**
 * create:2022-08-31
 */
public class User {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String passWord;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 上次登录时间
     */
    private Date lastLoginTime;

    /**
     * 手机号
     */
    private Integer phone;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
}
}
