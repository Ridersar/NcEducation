package com.nc.autumn2020.solutions.lesson5;

public abstract class Storage {
    private String name;
    private double capacityWeight;
    private int capacityQuantity;
    private Fruit[] masFruits;

    private double weightFruits = 0.0;
    private int quantityFruits = 0;

    protected Storage(String name, double capacityWeight, int capacityQuantity) {
        this.name = name;
        this.capacityWeight = capacityWeight;
        this.capacityQuantity = capacityQuantity;
        this.masFruits = new Fruit[capacityQuantity];
    }

    public void put(Fruit fruit) {
        if (weightFruits + fruit.getWeight() <= capacityWeight
                && quantityFruits + 1 <= capacityQuantity) {
            masFruits[quantityFruits] = fruit;
            quantityFruits++;
            weightFruits += fruit.getWeight();
            System.out.println("Фрукт - " + fruit.getName() + " - положен в " + name);
        } else
            System.out.println("Хранилище - " + name + " - заполнено, нет места для фрукта");
    }

    public Fruit take() {
        if (quantityFruits > 0) {
            Fruit fruit = masFruits[quantityFruits - 1];
            quantityFruits--;
            weightFruits -= fruit.getWeight();
            System.out.println("Фрукт - " + fruit.getName() + " - взят из " + name);
            return fruit;
        } else {
            System.out.println("Хранилище - " + name + " - пустое");
            return null;
        }
    }

    public void info() {
        System.out.println("Информация: Хранилище - " + name + " - содержит в себе " + quantityFruits
                + " фруктов, общий вес которых составляет " + String.format("%.3f", weightFruits) + " килограмм");
    }
}
