package com.wzs.creativeModel.builder.food;

import com.wzs.creativeModel.builder.abstracts.ColdDrink;

public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 15.0f;
    }
}
