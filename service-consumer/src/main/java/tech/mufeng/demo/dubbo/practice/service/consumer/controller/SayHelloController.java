package tech.mufeng.demo.dubbo.practice.service.consumer.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tech.mufeng.demo.dubbo.practice.service.provider.service.SayHelloService;

@RestController
public class SayHelloController {

    @Reference
    private SayHelloService sayHelloService;

    @GetMapping("/say-hello")
    public String satHello(@RequestParam String name) {
        return sayHelloService.sayHello(name);
    }
}
