package com.wzs.creativeModel.abstractFactory.factoryService;

import com.wzs.creativeModel.service.Sender;

public interface Provider {
    Sender produce();
}
