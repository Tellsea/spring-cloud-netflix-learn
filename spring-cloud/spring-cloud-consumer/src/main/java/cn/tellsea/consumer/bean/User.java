package cn.tellsea.consumer.bean;

import lombok.Data;

import java.util.Date;

@Data
public class User {

    private Long id;

    private String username;// 用户名

    private String password;// 密码

    private String phone;// 电话

    private Date created;// 创建时间

    private String salt;// 密码的盐值
}