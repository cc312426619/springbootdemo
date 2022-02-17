package com.ydc.springbootdemo.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sun.plugin.com.BeanClass;

@Configuration
public class ConditionConfig {

    @Bean
    public BeanClass beanClass() {
        return new BeanClass(GpCondition.class);
    }
}
