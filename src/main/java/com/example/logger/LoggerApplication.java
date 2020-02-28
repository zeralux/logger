package com.example.logger;

import com.example.logger.demo.SLF4JDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoggerApplication.class, args);

        // 測試
        SLF4JDemo slf4Demo = new SLF4JDemo();
        slf4Demo.testSlf4j();

    }

}
