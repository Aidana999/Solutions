package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String E1 = scan.nextLine();
        E1 = E1.replaceAll("[^0-9]","");
        System.out.println(E1);
    }
}
