package com.nc.autumn2020.solutions.lesson8;

import java.util.Objects;

public class ComplexNumber {
    private int a;
    private int b;

    public ComplexNumber(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexNumber that = (ComplexNumber) o;
        return a == that.a &&
                b == that.b;
    }
}
