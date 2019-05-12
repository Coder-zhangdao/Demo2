package com.wzs.creativeModel.singleton;

/**
 * 单例模式 - 懒汉模式
 * 懒汉式是典型的时间换空间，存在线程安全问题
 */
public class LazySingleton {
    //持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载
    private static LazySingleton instance = null;

    //私有构造方法，防止被实例化
    private LazySingleton(){};

    //这样毫无线程安全保护的类，如果我们把它放入多线程的环境下，肯定就会出现问题了
    /*public static LazySingleton getInstance(){
        if(instance==null){
            instance = new LazySingleton();
        }
        return instance;
    }*/

    //synchronized关键字锁住的是这个对象，这样的用法，在性能上会有所下降
    /*public static synchronized LazySingleton getInstance(){
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }*/

    /**
     * 在Java指令中创建对象和赋值操作是分开进行的，也就是说instance = new Singleton();语句是分两步执行的。
     * 但是JVM并不保证这两个操作的先后顺序，也就是说有可能JVM会为新的Singleton实例分配空间，
     * 然后直接赋值给instance成员，然后再去初始化这个Singleton实例。
     * edj:
     *  a>A、B线程同时进入了第一个if判断
     *  b>A首先进入synchronized块，由于instance为null，所以它执行instance = new Singleton();
     *  c>由于JVM内部的优化机制，JVM先画出了一些分配给Singleton实例的空白内存，并赋值给instance成员（注意此时JVM没有开始初始化这个实例），然后A离开了synchronized块。
     *  d>B进入synchronized块，由于instance此时不是null，因此它马上离开了synchronized块并将结果返回给调用该方法的程序。
     *  e>此时B线程打算使用Singleton实例，却发现它没有被初始化，于是错误发生了。
     * @return
     */
    /*public static LazySingleton getInstance(){
        if(instance==null){
            synchronized (instance){
                if(instance==null){
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }*/

    /**
     * 单例模式使用内部类来维护单例的实现，JVM内部的机制能够保证当一个类被加载的时候，这个类的加载过程是线程互斥的。
     * 这样当我们第一次调用getInstance的时候，JVM能够帮我们保证instance只被创建一次，
     * 并且会保证把赋值给instance的内存初始化完毕，这样我们就不用担心上面的问题。
     * 同时该方法也只会在第一次调用的时候使用互斥机制，这样就解决了低性能问题。
     */
    private static class SingletonFactory{
        private static LazySingleton instance = new LazySingleton();
    }
    public static LazySingleton getInstance(){
        return SingletonFactory.instance;
    }
}
