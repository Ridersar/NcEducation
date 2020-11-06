package com.nc.autumn2020;

import com.nc.autumn2020.lesson6.DinamicClassLoaderExample;
import com.nc.autumn2020.solutions.additional.decript.SolutionDecript;
import com.nc.autumn2020.solutions.lesson3.SolutionLesson3;
import com.nc.autumn2020.solutions.lesson5.Solution1;
import com.nc.autumn2020.solutions.lesson6.SolutionLesson6;

//import com.nc.autumn2020.solutions.additional.decript.SolutionLesson3;

public class Main {
    public static void main(String[] args) {
        //new SolutionLesson3().run(args);
        //DinamicClassLoaderExample stringLesson = new DinamicClassLoaderExample();
        //stringLesson.executeSolution(args);
        SolutionLesson6 sl = new SolutionLesson6();
        sl.executeSolution(args);
    }
}
