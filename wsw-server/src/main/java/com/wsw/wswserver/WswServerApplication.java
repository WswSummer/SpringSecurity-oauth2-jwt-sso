package com.wsw.wswserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})  // 排除自动注入数据源的配置（取消数据库配置）
public class WswServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WswServerApplication.class, args);
    }

}
