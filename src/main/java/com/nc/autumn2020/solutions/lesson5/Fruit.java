package com.nc.autumn2020.solutions.lesson5;

public abstract class Fruit implements Eatable {
    private String name;
    private double weight;
    private int calorificValue;

    protected Fruit(String name, double weight, int calorificValue) {
        if (weight > 0.0) {
            this.name = name;
            this.weight = weight;
            this.calorificValue = calorificValue;
        }
        else
            System.out.println("Ошибка создания фрукта: вес должен быть положительным");
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getCalorificValue() {
        return calorificValue;
    }

    @Override
    public void eat() {
        System.out.println("Фрукт - " + name + " - съеден. Получено " + calorificValue + " килокалорий");
    }
}
