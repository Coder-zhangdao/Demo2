package com.wzs.creativeModel.factoryMethod;

import org.junit.jupiter.api.Test;

public class AbstractFactoryTest {
    /**
     * 测试普通工厂模式
     * 如果传递的字符串出错，则不能正确创建对象
     */
    @Test
    public void OrdinarySendFactory()
    {
        OrdinarySendFactory sendFactory = new OrdinarySendFactory();
        sendFactory.produce("mail").send();
        sendFactory.produce("sms").send();
        //报错空指针
        sendFactory.produce("abc").send();
    }

    /**
     * 测试多个工厂方法模式
     * 多个工厂方法模式是提供多个工厂方法，分别创建对象
     */
    @Test
    public void MultipleSendFactory(){
        MultipleSendFactory multipleSendFactory = new MultipleSendFactory();
        multipleSendFactory.produceMail().send();
        multipleSendFactory.produceSms().send();
    }

    /**
     * 测试静态工厂方法模式
     * 相对于多个工厂方法模式，不需要实例化工厂类大多数情况下，选用静态工厂方法模式
     */
    @Test
    public void StaticSendFactory(){
        StaticSendFactory.produceMail().send();
        StaticSendFactory.produceSms().send();
    }
}
