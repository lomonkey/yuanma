package com.lomonkey.study;

import com.lomonkey.study.pojo.A;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lvdoudou
 * @version 1.0
 * @date 2024/5/31 15:26
 * @description 学习spring 源码的类
 */
public class MainStudy {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("a.xml");
        A a = classPathXmlApplicationContext.getBean("a", A.class);
        System.out.print(a);
    }
}
