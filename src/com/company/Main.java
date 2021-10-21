package com.company;
import java.io.CharArrayReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

    System.out.println("Type a word");
    String word = scan.nextLine();
    System.out.println("Type a number");
    int number = scan.nextInt();

    int wordLength = word.length();
    if (number > wordLength) {
        System.out.println("Restart program and enter a different number");
    }
    else {

        char letter = word.charAt(number);
        System.out.println(letter + " is letter " + number + " of the word " + word);
    }





    }
}
