package com.dao.custom.entity;

import com.zmf.temp1.annotation.Entity;

@Entity("City")
public class CityEntity {
    private String Id;
    private String name;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
