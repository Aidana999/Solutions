package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String E1 = scan.nextLine();
        int count = 0;
        if(E1.length() != 0) {
            count++;
        }
        for (int i = 0; i < E1.length(); i++) {
                if (E1.charAt(i) == ' ') {
                    count++;
                }
        }
        System.out.println(count);
    }
}
