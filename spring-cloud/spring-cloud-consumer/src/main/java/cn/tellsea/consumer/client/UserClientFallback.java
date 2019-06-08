package cn.tellsea.consumer.client;

import org.springframework.stereotype.Component;

@Component
public class UserClientFallback implements UserClient {

    @Override
    public String queryById(Long id) {
        return "Feign 熔断机制：服务器拥挤！！！";
    }
}
