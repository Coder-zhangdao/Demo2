package com.wzs.creativeModel.service.impl;

import com.wzs.creativeModel.service.Sender;

public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is mail sender!");
    }
}
