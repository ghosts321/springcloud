package com.spring.cloud.eurekacustomer.moudles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by JiangJunpeng on 2019/6/4.<br>
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/hello")
    public String hello(@RequestParam String name){
        return helloService.helloService(name);
    }
}
