package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String lilWord = scan.nextLine();
        Pattern patt = Pattern.compile(lilWord);
        Matcher mat = patt.matcher(text);
        int counter = 0;
        while (mat.find()) {
            counter++;
        }
        System.out.println(counter);
    }
}
