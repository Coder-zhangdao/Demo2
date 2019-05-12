package com.zmf.temp1.test;

import com.zmf.temp1.entity.CityEntity;
import com.zmf.temp1.util.CommUtil;

public class Test {
    public static void main(String[] args) {
        CityEntity cityEntity = new CityEntity();
        /*cityEntity.setId("001");
        cityEntity.setName("北京");*/
        String sql = CommUtil.buildQuerySql(cityEntity);
        System.out.println(sql);
        CommUtil.testReflex(cityEntity);
    }
}
