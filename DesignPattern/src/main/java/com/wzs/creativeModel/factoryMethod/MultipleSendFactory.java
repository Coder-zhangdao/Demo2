package com.wzs.creativeModel.factoryMethod;

import com.wzs.creativeModel.service.Sender;
import com.wzs.creativeModel.service.impl.MailSender;
import com.wzs.creativeModel.service.impl.SmsSender;

/**
 * 多个工厂方法模式
 */
public class MultipleSendFactory {
    public Sender produceMail(){
        return new MailSender();
    }
    public Sender produceSms(){
        return new SmsSender();
    }
}
