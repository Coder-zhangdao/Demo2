package com.wzs.creativeModel.singleton;

/**
 * 单例模式 - 饿汉模式
 * 饿汉式是线程安全的，因为虚拟机保证只会装载一次，在装载类的时候是不会发生并发的
 */
public class HungrySingleton {
    private static HungrySingleton singleton = new HungrySingleton();
    private HungrySingleton(){};
    public static HungrySingleton getInstance(){
        return singleton;
    }
}
