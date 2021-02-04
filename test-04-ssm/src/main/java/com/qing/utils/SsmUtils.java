package com.qing.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 卿
 * @create 2020-12-23 9:57
 */
public class SsmUtils {
    // 私有化构造器
//    private SsmUtils(){
//
//    }

    /**
     * 获取spring容器中的对象
     * @param beanName
     * @param type
     * @param <T>
     * @return
     */
    public static <T> T getBean(String beanName,Class<T> type){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        return context.getBean(beanName, type);
    }
}
