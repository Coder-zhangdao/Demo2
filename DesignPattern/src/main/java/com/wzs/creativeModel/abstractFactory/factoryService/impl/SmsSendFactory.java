package com.wzs.creativeModel.abstractFactory.factoryService.impl;

import com.wzs.creativeModel.abstractFactory.factoryService.Provider;
import com.wzs.creativeModel.service.Sender;
import com.wzs.creativeModel.service.impl.SmsSender;

/**
 * 短信发送工厂
 */
public class SmsSendFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
