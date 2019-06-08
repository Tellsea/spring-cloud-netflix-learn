package cn.tellsea.boot.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient // 通用注册服务
@EnableAdminServer // 监控服务端
public class BootAdminApplication {

    // 这篇文章配置了账号密码：https://blog.csdn.net/hubo_88/article/details/80671192
    public static void main(String[] args) {
        SpringApplication.run(BootAdminApplication.class, args);
    }
}
