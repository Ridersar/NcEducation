package com.nc.autumn2020.solutions.lesson3;

import com.nc.autumn2020.LessonApi;

public class SolutionLesson3 implements LessonApi {
    public void run(String[] args){
    }

    @Override
    public void executeSolution(String[] args) {
        Cheeseburger burger = new Cheeseburger.Builder("пшеничная","говяжья","чедер").
                tomato((short) 2).
                lettuce((short) 1).
                sauce("чесночный").
                build();
        System.out.println(burger);
    }
}
