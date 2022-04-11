package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String something = scan.nextLine();
        String plusWord = scan.nextLine();
        String newWord =  word.replace(something, plusWord);
        System.out.println(newWord);
    }
}
