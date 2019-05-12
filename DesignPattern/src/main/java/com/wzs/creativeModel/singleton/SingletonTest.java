package com.wzs.creativeModel.singleton;

import org.junit.jupiter.api.Test;

public class SingletonTest {
    /**
     * 测试普通类创建两次是否相等
     */
    @Test
    public void ordinaryClassTest(){
        Ordinary ordinary1 = new Ordinary();
        Ordinary ordinary2 = new Ordinary();
        System.out.println(ordinary1.hashCode());
        System.out.println(ordinary2.hashCode());
        System.out.println(ordinary1==ordinary2);
    }

    /**
     * 测试单例懒汉模式
     * 创建两次是否相等
     */
    @Test
    public void lazyModelTest(){
        LazySingleton singleton1 = LazySingleton.getInstance();
        LazySingleton singleton2 = LazySingleton.getInstance();
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
        System.out.println(singleton1==singleton2);
    }

    /**
     * 测试单例饿汉模式
     * 创建两次是否相等
     */
    @Test
    public void hungryModelTest(){
        HungrySingleton singleton1 = HungrySingleton.getInstance();
        HungrySingleton singleton2 = HungrySingleton.getInstance();
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
        System.out.println(singleton1==singleton2);

    }

}
