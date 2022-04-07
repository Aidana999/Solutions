package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sorted = scan.nextLine();
        char [] charArray = sorted.toCharArray ();
        Arrays.sort (charArray);
        System.out.println (String.valueOf (charArray));
    }
}
