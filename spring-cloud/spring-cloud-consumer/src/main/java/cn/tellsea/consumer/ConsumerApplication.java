package cn.tellsea.consumer;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

//@SpringBootApplication
//@EnableDiscoveryClient // 注册服务
//@EnableCircuitBreaker // 服务熔断
@EnableFeignClients // 开启远程调用
@SpringCloudApplication // 上面的三个注解
@EnableSwagger2Doc // 启用swagger2
@EnableHystrixDashboard // 开启熔断监控
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
