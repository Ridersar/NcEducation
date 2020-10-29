package com.nc.autumn2020.solutions.lesson3;

public class Solution1 {
    public void run(String[] args){
        Cheeseburger burger = new Cheeseburger.Builder("пшеничная","говяжья","чедер").
                tomato((short) 2).
                lettuce((short) 1).
                sauce("чесночный").
                build();
        System.out.println(burger);
    }
}
