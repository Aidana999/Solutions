package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String E1 = scan.nextLine();
        int count = 0;
        for (int i = 0; i < E1.length(); i++) {
            if (Character.isDigit(E1.charAt(i))) {
                count++;
            }
        }
        System.out.println(count);
    }
}
