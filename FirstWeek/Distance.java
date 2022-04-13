package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String one = scan.next();
        String two = scan.next();
        int first = text.indexOf(one);
        int second = text.indexOf(two);
        int distance ;
        distance = (second - first - one.length());
            System.out.println(distance);
    }
}
