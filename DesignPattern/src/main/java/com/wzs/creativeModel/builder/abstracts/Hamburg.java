package com.wzs.creativeModel.builder.abstracts;

import com.wzs.creativeModel.builder.interfaces.impl.Wrapper;
import com.wzs.creativeModel.builder.interfaces.Item;
import com.wzs.creativeModel.builder.interfaces.Packing;

public abstract class Hamburg implements Item {
    @Override
    public Packing packing(){
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
