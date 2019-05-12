package com.wzs.creativeModel.abstractFactory.factoryService.impl;

import com.wzs.creativeModel.abstractFactory.factoryService.Provider;
import com.wzs.creativeModel.service.Sender;
import com.wzs.creativeModel.service.impl.MailSender;

/**
 * 邮件发送工厂
 */
public class MailSendFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
