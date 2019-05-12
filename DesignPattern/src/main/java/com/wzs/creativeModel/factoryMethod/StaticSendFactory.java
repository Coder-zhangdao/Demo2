package com.wzs.creativeModel.factoryMethod;

import com.wzs.creativeModel.service.Sender;
import com.wzs.creativeModel.service.impl.MailSender;
import com.wzs.creativeModel.service.impl.SmsSender;

/**
 * 静态工厂方法模式
 */
public class StaticSendFactory {
    public static Sender produceMail(){
        return new MailSender();
    }
    public static Sender produceSms(){
        return new SmsSender();
    }
}
