package com.autoconfig.config;

import com.autoconfig.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(MyConfig.class)
public class AutoConfig {
    @Bean
    public User myUser(){
        return new User();
    }
}
