/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Trae Roy
 */

import java.util.Scanner;

public class Solution31 {
    /*
    * make constant scanner 'input'
    * make string method to scan string input 'inputMethod'
    * make boolean method that takes string
        * if parse to int is successful string is integers, true
        * otherwise, false
    * make method to print intensity rate table
        * declare idex variable
        * for loop i = 55, starting, through 95, increment 5 each for percents
            * declare integer variable rate calc rate using formula
            * print ' 'i' tabtabtab 'rate'
    * main
    * declare class variable 'sol'
    * while condition while 'pulse' is integer, check with 'checkDigits'
        * parse to integer if valid
        * otherwise print ' Invalid pulse. '
     * while condition while 'age' is integer, check with 'checkDigits'
        * parse to integer if valid
        * otherwise print ' Invalid age. '
    * print top of table print 'Intensity tab Rate'
    * call 'getIntRate' to get table
    */
    /*
     * JUnit 5
     * checkDigits testing
     * hard code string to be '65'
     * set True to run test on method
     * should be true
     */
    // constant scanner
    private static final Scanner input = new Scanner(System.in);

    // input
    private String inputMethod(String prompt){
        System.out.println(prompt);
        return input.next();
    }

    // check if digits
    public boolean checkDigits(String str) {

        try {
            Integer.parseInt(str);
        }catch(Exception e) {
            return false;
        }
        return true;
    }

    // calc intensity and rate
    public void getIntRate(int age, int pulse){

        int i;

        for(i = 55 ; i <= 95 ; i += 5) {
            int rate = ((220 - age - pulse) * i/100) + pulse;
            System.out.printf("%d\t\t\t%d bpm\n", i, rate);
        }
    }

    // main
    public static void main(String[] args) {
        Solution31 sol = new Solution31();

        int restingPulse, currAge;

        while(true) {

            String pulse = sol.inputMethod("Enter Resting Pulse: ");

            if(sol.checkDigits(pulse)) {
                restingPulse = Integer.parseInt(pulse);
                break;
            }else {
                System.out.println("Invalid Pulse");
            }
        }

        while(true) {

            String age = sol.inputMethod("Enter Age: ");

            if(sol.checkDigits(age)) {
                currAge = Integer.parseInt(age);
                break;
            }else {
                System.out.println("Invalid Age");
            }
        }
        System.out.println("Intensity\tRate");
        sol.getIntRate(currAge, restingPulse);
    }
}