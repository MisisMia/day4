package com.company;

import org.w3c.dom.ls.LSOutput;

public class TestIf {
    public static void main(String[] args) {
        // create check of temperature if its higher than 80.1 print = hot
        //from 75-80" Justright!"
        // less than 75" Cold!"
        double t = 75.0;

        if (t >= 80.1) {
            System.out.println("Hot!");
        } else if (t >= 75.0 && t <= 80.0) {
            System.out.println("Just fine!");
        } else {
            System.out.println("Too Cold!");
        }
        System.out.println("------------------");


    }
}
