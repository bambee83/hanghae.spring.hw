package com.sparta.hanghaeboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing //created 같은거,,,알아보자!
@SpringBootApplication
public class HanghaeboardApplication {

    public static void main(String[] args) {

        SpringApplication.run(HanghaeboardApplication.class, args);
    }

}