package com.wzs.creativeModel.factoryMethod;

import com.wzs.creativeModel.service.Sender;
import com.wzs.creativeModel.service.impl.MailSender;
import com.wzs.creativeModel.service.impl.SmsSender;

/**
 * SendFactory 普通工厂模式
 */
public class OrdinarySendFactory
{
    public Sender produce(String type){
        if(type.equals("mail")){
            return new MailSender();
        }else if(type.equals("sms")){
            return new SmsSender();
        }else{
            return null;
        }
    }
}
