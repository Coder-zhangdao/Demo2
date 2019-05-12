package com.wzs.creativeModel.builder.food;

import com.wzs.creativeModel.builder.abstracts.Hamburg;

public class VegBurger extends Hamburg {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 9.5f;
    }
}
