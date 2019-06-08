package cn.tellsea.user.bean;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "tb_user")
public class User {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;

    private String username;// 用户名

    private String password;// 密码

    private String phone;// 电话

    private Date created;// 创建时间

    private String salt;// 密码的盐值
}