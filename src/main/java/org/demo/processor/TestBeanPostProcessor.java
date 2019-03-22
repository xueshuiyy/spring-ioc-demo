package org.demo.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by Administrator on 2019/3/22.
 */
public class TestBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("进入 postProcessBeforeInitialization:" );
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("进入 postProcessAfterInitialization" );
        return bean;
    }
}
