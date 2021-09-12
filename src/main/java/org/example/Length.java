/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cameron Parrish
 */

package org.example;
import java.util.Scanner;

class Length {
    public static void main( String[] args ) {

        Scanner input = new Scanner(System.in);

        System.out.print( "What is the input string?" );
        String name = input.nextLine();

        System.out.println(name + " has " + name.length() + " characters");

    }
}
