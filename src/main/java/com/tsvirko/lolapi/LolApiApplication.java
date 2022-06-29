package com.tsvirko.lolapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class LolApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(LolApiApplication.class, args);
    }

}
