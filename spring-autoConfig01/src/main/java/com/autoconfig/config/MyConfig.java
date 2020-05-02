package com.autoconfig.config;

import com.autoconfig.pojo.Student;
import org.springframework.context.annotation.Bean;

public class MyConfig {
    @Bean
    public Student student(){
        return new Student();
    }
}
