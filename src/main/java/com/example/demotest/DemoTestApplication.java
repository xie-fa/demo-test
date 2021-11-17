package com.example.demotest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoTestApplication {

    public static void main(String[] args) {
        test();
        SpringApplication.run(DemoTestApplication.class, args);
    }

    public static void test(){
        System.out.println("test");
    }

}
