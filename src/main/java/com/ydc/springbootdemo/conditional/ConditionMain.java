package com.ydc.springbootdemo.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sun.plugin.com.BeanClass;

public class ConditionMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        BeanClass beanClass = context.getBean(BeanClass.class);
        System.out.println(beanClass);
    }
}
