package cn.tellsea.consumer.web;

import cn.tellsea.consumer.client.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("consumer")
public class DemoController {

    @Autowired
    private UserClient userClient;

    // feign远程调用
    @GetMapping("{id}")
    public String queryById(@PathVariable Long id) {
        return userClient.queryById(id);
    }

}