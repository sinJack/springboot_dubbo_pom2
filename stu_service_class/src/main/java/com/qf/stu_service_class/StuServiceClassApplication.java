package com.qf.stu_service_class;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.qf")
@MapperScan("com.qf.dao")
@DubboComponentScan("com.qf.service.impl")  //扫描dubbo的实现类
public class StuServiceClassApplication {

    public static void main(String[] args) {
        SpringApplication.run(StuServiceClassApplication.class, args);
    }

}
