package com.wuque.springbootlog.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName LogConfig
 * @Description TODO
 * @Author huawei
 * @Date 2019/4/1 22:18
 * @Version 1.0
 **/
@Configuration
public class LogConfig {

    // Logger和LoggerFactory导入的是org.slf4j包
    private static final Logger log = LoggerFactory.getLogger(LogConfig.class);

    @Bean
    public Object logMethod(){
        log.info("=========== print log ===========");
        return "log console out";
    }
}
