package com.sj.zhihuishenji;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication(scanBasePackages = {"com.sj"})
@MapperScan(basePackages = "com.sj.mapper")
public class ZhihuishenjiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhihuishenjiApplication.class, args);
    }

}
