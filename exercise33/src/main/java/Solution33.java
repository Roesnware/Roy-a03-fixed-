/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Trae Roy
 */

import java.util.Random;
import java.util.Scanner;

public class Solution33 {
    /*
    * make constant scanner input
    * make String method to scan input inputMethod
    * main
    * declare class variable sol
    * declarer random number variable rand
    * put responses in an output array
    * prompt for question
    * declare integer variable index to select random response in output array
    * print output
    * print new line
    */
    /*
    * JUnit 5
    * no methods to unit test all input and randomness
    */
    // constant scanner
    private static final Scanner input = new Scanner(System.in);

    // input
    private String inputMethod(){
        System.out.println("What's your question? ");
        return input.next();
    }

    // main
    public static void main(String[] args) {
        Solution33 sol = new Solution33();
        Random rand = new Random();

        String[] output = {"Yes", "No", "Maybe", "Ask again later"};

        String question = sol.inputMethod();

        int index = rand.nextInt(output.length);

        String response = output[index];
        System.out.println();
        System.out.println(response);
    }
}
