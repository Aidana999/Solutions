package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String E1 = scan.nextLine();
        String[] word = E1.split(" ");
        StringBuilder app = new StringBuilder();;
        StringBuilder rev;
        for (int i = 0; i < word.length; i++) {
            rev= new StringBuilder(word[i]);
            app.append(rev.reverse() + " ");
        }
        System.out.println(app.toString());
    }
}
