package com.seavus.calculator;

public class Calculator {


    public Integer add(Integer x, Integer y) {
        if (x == null || y == null) {
            throw new IllegalArgumentException("Some message");
        }

        Long x1 = x.longValue();
        Long y1 = y.longValue();
        Long sum = x1 + y1;

        return x + y;
    }
}
