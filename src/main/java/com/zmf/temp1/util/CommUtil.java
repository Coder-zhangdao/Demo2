package com.zmf.temp1.util;

import com.zmf.temp1.annotation.Entity;

import java.lang.reflect.Field;

public class CommUtil {
    public static void testReflex(Object object){
        Class clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for(int i=0;i<fields.length;i++){
            String fieldName = fields[i].getName();
            System.out.println(fieldName);
        }
    }

    public static String buildQuerySql(Object object){
        Class clazz = object.getClass();
        //判断是否加了该注解
        StringBuffer strEntity = new StringBuffer();
        strEntity.append("select * from ");
        if(clazz.isAnnotationPresent(Entity.class)){
            Entity entity = (Entity)clazz.getAnnotation(Entity.class);
            System.out.println(entity.value());
            strEntity.append(entity.value());
        }
        strEntity.append(" where id='1' and name='北京'");
        return strEntity.toString();
    }
}
