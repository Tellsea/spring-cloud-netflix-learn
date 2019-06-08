package cn.tellsea.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "spring-cloud-user", fallback = UserClientFallback.class)
public interface UserClient {

    @GetMapping("/user/{id}")
    String queryById(@PathVariable Long id);
}
