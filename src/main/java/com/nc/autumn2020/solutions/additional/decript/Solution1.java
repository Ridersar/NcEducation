package com.nc.autumn2020.solutions.additional.decript;

public class Solution1 {
    public void run(String[] args){
        String fileIn = "src/main/java/com/nc/autumn2020/solutions/additional/decript/encript.txt";
        String fileOut = "src/main/java/com/nc/autumn2020/solutions/additional/decript/decript.png";
        Decript decript = new Decript(fileIn, fileOut);
        decript.decriptFile();
    }
}
