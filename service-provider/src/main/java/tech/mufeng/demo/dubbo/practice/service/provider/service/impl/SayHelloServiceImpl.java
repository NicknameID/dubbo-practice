package tech.mufeng.demo.dubbo.practice.service.provider.service.impl;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import tech.mufeng.demo.dubbo.practice.service.provider.service.SayHelloService;


@Service
@Component
public class SayHelloServiceImpl implements SayHelloService {
    @Value("${dubbo.application.name}")
    private String serviceName;

    @Override
    public String sayHello(String name) {
        return String.format("[%s] : Hello, %s", serviceName, name);
    }
}
