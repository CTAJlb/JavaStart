package com.gmail.vlad.piskunov88.Lesson2;

import java.util.Scanner;

/**
 HW input number 54698
 Output will be:
 5
 4
 6
 9
 8
 */


public class HwTask1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number;
        int a;
        int b;
        int c;
        int d;
        int e;
        System.out.println("Please input your number: ");
        number = sc.nextInt();
        a = number/10000;
        b = number%10000/1000;
        c = number%1000/100;
        d = number%100/10;
        e = number%10;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
