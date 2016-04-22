package com.gmail.vlad.piskunov88.Lesson2;

import java.util.Scanner;

/**
 Написать программу которая вычислит и выведет на экран
 длину окружности, если ее радиус считывается с клавиатуры.
 */
public class HwTask3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r;
        double l;

        System.out.println("Please input radius size ");
        r = sc.nextInt();
        l = 2 * Math.PI * r;

        System.out.println(l);

    }
}
