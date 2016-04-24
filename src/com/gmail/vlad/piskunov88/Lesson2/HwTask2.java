package com.gmail.vlad.piskunov88.Lesson2;

import java.util.Scanner;

/**
 Написать программу которая вычислит и выведет на экран
 площадь треугольника если известны его стороны.
 */
public class HwTask2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        double c;

        double s;
        double p;

        System.out.println("Please input size sides:  ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        p = (a +b +c)/2;
        s = Math.sqrt(p * (p - a) * (p-b) * (p-c));

//        System.out.println(p);
        System.out.println(s);


    }
}
