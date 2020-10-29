package com.nc.autumn2020.lesson3;

public class BoxUnbox {
    public BoxUnbox() {

        //автоупаковка
        Integer i = 10;

        //автоупаковка метода
        box(10);

        //автораспаковка
        int i1 = new Integer(10);

        unbox(new Integer(10));

        Integer integer = new Integer(10);
        box(integer);

        //выражение
        int i3 = new Integer(10) +
                new Integer(10);

        boolean b = new Integer(10) < new Integer(1);

        Integer i5 = null;


    }
    void unbox(int i){

    }

    void box(Integer i){

    }
}
