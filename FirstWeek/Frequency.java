package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String E1 = scan.nextLine();
        char ch = scan.next().charAt(0);
        int freq = 0;

        for(int i = 0; i < E1.length(); i++) {
            if(ch == E1.charAt(i)) {
                ++freq;
            }
        }

        System.out.println( ch + "=" + freq);
    }
}
