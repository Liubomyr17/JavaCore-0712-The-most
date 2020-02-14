package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/*

0712 The most

1. Create a list of strings.
2. Add 10 lines from the keyboard to it.
3. Find out which line in the list occurs earlier: the shortest or the longest.
If there are several such lines, then the very first of them should be taken into account.
4. Display the line from item 3.

Requirements:
1. Declare a variable like list of strings and immediately initialize ee.
2. The program should read 10 lines from the keyboard and add them to the list.
3. The program should display the shortest line if it was before the longest.
4. The program should display the longest line if it was before the shortest.

 */

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();

        for(int i=0; i<10;i++) {
            strings.add(reader.readLine());
        }
        int maxLength=0;
        int minLength=Integer.MAX_VALUE;
        for(String string : strings) {
            if(string.length()>maxLength) {
                maxLength=string.length();
            }
            if(string.length()<minLength) {
                minLength=string.length();
            }
        }
        for(String string : strings) {
            if(string.length() == minLength || string.length() == maxLength) {
                System.out.println(string);
            }
        }
    }
}









