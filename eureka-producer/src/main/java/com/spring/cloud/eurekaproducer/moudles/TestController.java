package com.spring.cloud.eurekaproducer.moudles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by JiangJunpeng on 2019/6/4.<br>
 */
@RestController
public class TestController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/hello")
    public String home(@RequestParam String name) {
        return "hello " + name + ",我是来自端口号:" + port + "的生产者";
    }
}
