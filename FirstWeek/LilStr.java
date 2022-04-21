package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        Scanner scanner = new Scanner(word);
        String[] splitStr = scanner.nextLine().split("\\s");
        int len = splitStr[0].length();
        String lilStr = splitStr[0];
        for (int i = 0; i < splitStr.length; i++) {
            if (splitStr[i].length() < len);
            lilStr = splitStr[i];
        }
        System.out.println(lilStr);
    }
}
