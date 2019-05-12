package com.wzs.creativeModel.builder.food;

import com.wzs.creativeModel.builder.abstracts.ColdDrink;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 9.0f;
    }
}
