package com.company;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        ReadFile
        File ReadFile = new File("src/com/company/loremipsum.txt");
        StringBuilder sb = new StringBuilder();
        try (Scanner scan = new Scanner(ReadFile)) {
            while (scan.hasNext()) {
                sb.append(scan.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String textBefore = sb.toString();
        System.out.println("Text before: " + textBefore);

//      Count String
        int count = 0;
        if(textBefore.length() != 0) {
            count++;
        }
        for (int i = 0; i < textBefore.length(); i++) {
            if (textBefore.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("Count String: " + count);

//        Delete duplicate
        String dup = new String();
        int length = textBefore.length();
        for (int i = 0; i < length; i++) {
            char charAtPosition = textBefore.charAt(i);
            if (dup.indexOf(charAtPosition) < 0) {
                dup += charAtPosition;
            }
        }
        System.out.println("Duplicate string:" + dup);

//      StrDigit
        textBefore = textBefore.replaceAll("[^0-9]","");
        System.out.println("Replace string:" + textBefore);
        
//      Wrote to the file
        try (FileWriter writeFile = new FileWriter("src/com/company/after.txt");) {
            writeFile.write(textBefore);
            System.out.println("Wrote to the file after.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
