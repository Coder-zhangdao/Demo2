package com.wzs.creativeModel.builder;

import com.wzs.creativeModel.builder.food.ChickenBurger;
import com.wzs.creativeModel.builder.food.Coke;
import com.wzs.creativeModel.builder.food.Pepsi;
import com.wzs.creativeModel.builder.food.VegBurger;

public class MealBuilder {
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
