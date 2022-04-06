package com.company;

import java.util.Scanner;

public class Main {

    public static void main (String str) {
        String dup = new String();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAtPosition = str.charAt(i);
            if (dup.indexOf(charAtPosition) < 0) {
                dup += charAtPosition;
            }
        }
        System.out.println(dup);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String E1 = scan.nextLine();
        main(E1);
    }
}
