package com.gmail.vlad.piskunov88.Lesson2;


import java.util.Scanner;

/**
 * Created by vpiskuno on 20.04.2016.
 */
public class SunnyDay {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price = 27.9;
        double path100km = 8.5;
        System.out.println("Input distance and press Enter");
        int distance = sc.nextInt();
        double totalSum;

        totalSum = path100km/100 * price * distance * 2 ;
        System.out.println(totalSum + " UAH");
//        602,36

//        2) формула герона
//        3) Math.PI (констатнта)
    }
}
