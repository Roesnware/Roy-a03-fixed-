/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Trae Roy
 */

import java.util.Scanner;

public class Solution29 {
    /*
    * make constant scanner
    * make method to scan in String input 'inputMethod'
    * make boolean method to check if string is digits 'checkDig'
        * for loop i = 0; through size of string; increment each loop
            * if characters in string are integers retrun true
            * otherwise return false
        * default base case to return false
    * make int method to calc the investment years 'getInvestment'
        * return 72/rate
    * main
    * declare class variable 'sol'
    * declare string variable 'myrate'
    * declare integer variable 'len' = get length of string
        * call checkDig to check if its digits
        * if so
            * turn string to integer using parseInt
            * make sure the 'rate' in between 1 and 72 not 0!!
                * declare integer variable 'investment' = calc investment years using 'getInvestment'
                * print 'It will take "investment" years to double your initial investment. '
            * else user entered 0
                * print 'Sorry. That's not a valid input. '
       * else user entered non digits
            * print 'Sorry. That's not a valid input. '
     */
    /*
     * JUnit 5
     *
     *
     */
    // constant scanner
    private static final Scanner input = new Scanner(System.in);

    // input
    private String inputMethod(){
    }

    public boolean checkDig(String myrate, int size){
    }

    // calc investment
    public int getInvestment(int rate){
    }

    // main
    public static void main(String[] args) {
    }
}
