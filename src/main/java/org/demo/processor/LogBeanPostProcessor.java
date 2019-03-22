package org.demo.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by Administrator on 2019/3/22.
 */
public class LogBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("进入 postProcessBeforeInitialization, 正在处理:" + beanName );
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("进入 postProcessAfterInitialization, 正在处理:" + beanName );
        return bean;
    }
}
