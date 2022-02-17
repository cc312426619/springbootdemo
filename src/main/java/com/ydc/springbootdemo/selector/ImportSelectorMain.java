package com.ydc.springbootdemo.selector;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

//@SpringBootApplication
@EnableAutoImport
public class ImportSelectorMain {

    public static void main(String[] args) {
        ConfigurableApplicationContext ca = SpringApplication.run(ImportSelectorMain.class, args);
        FirstClass fc = ca.getBean(FirstClass.class);
        fc.sayHello();
    }
}
