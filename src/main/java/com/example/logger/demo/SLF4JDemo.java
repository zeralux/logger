package com.example.logger.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLF4JDemo {

    public void testSlf4j() {
        Logger logger = LoggerFactory.getLogger(Object.class);
        logger.error("123");
    }
}
