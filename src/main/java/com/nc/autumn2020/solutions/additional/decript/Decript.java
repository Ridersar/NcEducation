package com.nc.autumn2020.solutions.additional.decript;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

public class Decript {
    private String fileIn;
    private String fileOut;

    public Decript(String fileIn, String fileOut) {
        this.fileIn = fileIn;
        this.fileOut = fileOut;
    }

    //декодирование файла
    public void decriptFile() {
        byte[] input = readFile(); //считывание данных
        byte[] output = Base64.getDecoder().decode(input); //декодирование данных
        writeFile(output); //запись декодированных данных
    }

    //считывание из файла
    public byte[] readFile() {
        byte[] input = new byte[0];
        try {
            Path path = Paths.get(fileIn); //путь к файлу
            input = Files.readAllBytes(path); //считывание байтов из файла
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
        return input;
    }

    //запись в файл
    public void writeFile(byte[] output) {
        try {
            Path path = Paths.get(fileOut); //путь к файлу
            Files.write(path, output); //запись байтов в файл
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
