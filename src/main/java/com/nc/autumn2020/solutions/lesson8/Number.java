package com.nc.autumn2020.solutions.lesson8;

import java.util.Objects;

public class Number {
    private int num;

    public Number(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    @Override
    public int hashCode() {
        return num; //Objects.hash(num)
    }
}
