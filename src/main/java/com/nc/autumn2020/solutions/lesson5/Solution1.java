package com.nc.autumn2020.solutions.lesson5;

public class Solution1 {
    public void run(String[] args){
        Human human = new Human();
        PlasticСontainer plasticСontainer = new PlasticСontainer();
        FruitBasket fruitBasket = new FruitBasket();
        Apple apple1 = new Apple(0.150);
        Apple apple2 = new Apple(0.140);
        Apple apple3 = new Apple(0.180);
        Apple apple4 = new Apple(0.160);
        Apple apple5 = new Apple(0.150);
        Apple apple6 = new Apple(0.170);
        Orange orange1 = new Orange(0.200);
        Orange orange2 = new Orange(0.220);
        Orange orange3 = new Orange(0.170);
        Orange orange4 = new Orange(0.190);
        Orange orange5 = new Orange(0.180);
        Orange orange6 = new Orange(0.200);

        Fruit fruit1 = plasticСontainer.take();
        human.eat(fruit1);

        plasticСontainer.put(apple1);
        plasticСontainer.put(orange1);
        plasticСontainer.info();
        Fruit fruit2 = plasticСontainer.take();
        human.eat(fruit2);

        plasticСontainer.put(orange2);
        plasticСontainer.put(orange3);
        plasticСontainer.put(orange4);
        plasticСontainer.put(apple2);
        plasticСontainer.put(orange6);
        plasticСontainer.info();
        Fruit fruit3 = plasticСontainer.take();
        human.eat(fruit3);
    }
}

