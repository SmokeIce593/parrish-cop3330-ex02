package org.example;
import java.util.Scanner;

class Length {
    public static void main( String[] args ) {

        Scanner input = new Scanner(System.in);

        System.out.print( "What is the input string?" );
        String name = input.next();

        System.out.println(name + " has " + name.length() + " characters");

    }
}