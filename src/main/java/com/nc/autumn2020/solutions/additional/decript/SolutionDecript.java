package com.nc.autumn2020.solutions.additional.decript;

import com.nc.autumn2020.LessonApi;

public class SolutionDecript implements LessonApi {
    public void run(String[] args){

    }

    @Override
    public void executeSolution(String[] args) {
        String fileIn = "src/main/java/com/nc/autumn2020/solutions/additional/decript/encript.txt";
        String fileOut = "src/main/java/com/nc/autumn2020/solutions/additional/decript/decript.png";
        Decript decript = new Decript(fileIn, fileOut);
        decript.decriptFile();
    }
}
