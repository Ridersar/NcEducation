package com.nc.autumn2020.solutions.lesson5;

import java.util.Objects;

public class Human {
    public void eat(Fruit fruit) {
        if (!Objects.isNull(fruit))
            fruit.eat();
        else
            System.out.println("Нечего съесть");
    }
}
