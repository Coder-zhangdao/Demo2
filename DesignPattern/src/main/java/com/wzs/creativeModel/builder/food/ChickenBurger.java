package com.wzs.creativeModel.builder.food;

import com.wzs.creativeModel.builder.abstracts.Hamburg;

public class ChickenBurger extends Hamburg {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 12.2f;
    }
}
