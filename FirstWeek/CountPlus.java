package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String lilWord = scan.nextLine();
        int count = 0;
        Pattern patt = Pattern.compile(lilWord);
        Matcher mat = patt.matcher(text);
        while (mat.find()) {
            count++;
        }
        System.out.println(count);
    }
}
