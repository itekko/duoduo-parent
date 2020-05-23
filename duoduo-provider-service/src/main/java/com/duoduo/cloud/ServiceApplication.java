package com.duoduo.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ekko
 * eureka启动类
 */
@SpringBootApplication
@RestController
public class ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class,args);
    }

    @RequestMapping("/")
    public String home() {
        return "Hello world";
    }

}
