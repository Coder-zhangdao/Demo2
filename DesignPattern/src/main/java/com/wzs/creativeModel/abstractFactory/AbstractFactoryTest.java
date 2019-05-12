package com.wzs.creativeModel.abstractFactory;

import com.wzs.creativeModel.abstractFactory.factoryService.Provider;
import com.wzs.creativeModel.abstractFactory.factoryService.impl.MailSendFactory;
import com.wzs.creativeModel.abstractFactory.factoryService.impl.SmsSendFactory;
import org.junit.jupiter.api.Test;

public class AbstractFactoryTest {
    /**
     * 测试抽象工厂模式
     * 如果想增加一个功能，则只需做一个实现类，实现Sender接口，
     * 同时做一个工厂类，实现Provider接口，就OK了
     */
    @Test
    public void Test(){
        System.out.println("----测试抽象工厂模式！----");
        Provider mailProvider = new MailSendFactory();
        mailProvider.produce().send();
        Provider smsProvider = new SmsSendFactory();
        smsProvider.produce().send();
    }
}
