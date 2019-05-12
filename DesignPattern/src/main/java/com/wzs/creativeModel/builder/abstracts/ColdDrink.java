package com.wzs.creativeModel.builder.abstracts;

import com.wzs.creativeModel.builder.interfaces.impl.Bottle;
import com.wzs.creativeModel.builder.interfaces.Item;
import com.wzs.creativeModel.builder.interfaces.Packing;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
