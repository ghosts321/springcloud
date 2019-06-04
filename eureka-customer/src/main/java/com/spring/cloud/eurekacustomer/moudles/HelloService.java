package com.spring.cloud.eurekacustomer.moudles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by JiangJunpeng on 2019/6/4.<br>
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String helloService(String name) {
        return restTemplate.getForObject("http://SERVICE-PRODUCER/hello?name=" + name, String.class);
    }
}
