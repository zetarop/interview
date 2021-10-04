package com.example.covidtracker;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class Int{

    private int a;
}

public class Test {

    public static void main(String[] args) {

        int a = 5;

        Int b = new Int(5);

        update(b);

        System.out.println(b.getA());
    }

    public static void update (Int a){

        a.setA(10);
    }
}
