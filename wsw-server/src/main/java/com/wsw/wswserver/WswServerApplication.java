package com.wsw.wswserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class WswServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WswServerApplication.class, args);
    }

}
