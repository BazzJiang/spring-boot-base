package com.jiangke.redis;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

/**
 * author:bazz jiang
 * date:Create in 2018-04-07
 * email:bazzjiang@gmail.com
 */
@SpringBootTest
@ContextConfiguration
public class ApplicationBaseTest extends AbstractTestNGSpringContextTests {
    @Configuration
    @EnableCaching
    @ComponentScan(basePackages = "com.jiangke")
    static class Config {
    }
}
