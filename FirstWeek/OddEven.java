package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String E1 = scan.nextLine();
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        for (int i = 0; i < E1.length(); i++) {
            if (i % 2 == 0) {
                even.append(E1.charAt(i));
            } else {
                odd.append(E1.charAt(i));
            }
        }
        System.out.println("Even: " + odd);
        System.out.println("Odd: " + even);
    }
}
