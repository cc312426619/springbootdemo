package com.ydc.springbootdemo.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class GpCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // 此处进行条件判断，如果返回true，表示需要加载该配置类或者Bean
        // 否则，表示不加载
        String os = context.getEnvironment().getProperty("os.name");
        if (os.contains("Windows")) {
            return true;
        }
        return false;
    }
}
