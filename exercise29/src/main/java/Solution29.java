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
     * test checkDig
     * hardcode string and size and check if it returns expected
     * test getInvestment
     * hardcode rate and check ans = expected
     */
    // constant scanner
    private static final Scanner input = new Scanner(System.in);

    // input
    private String inputMethod(){
        System.out.println("What is the rate of return? ");
        return input.next();
    }

    public boolean checkDig(String myrate, int size){

        for(int i = 0; i < size; i++) {
            if(myrate.charAt(i) >= '0' && myrate.charAt(i) <= '9') {
                return true;
            }else {
                return false;
            }
        }
        return false;
    }

    // calc investment
    public int getInvestment(int rate){
        return 72/rate;
    }

    // main
    public static void main(String[] args) {
        Solution29 sol = new Solution29();

        String myrate;

        while(true){
            myrate = sol.inputMethod();
            int len = myrate.length();
            if(sol.checkDig(myrate, len)){
                int rate = Integer.parseInt(myrate);
                if(rate >= 1 && rate <= 72){
                    int investment = sol.getInvestment(rate);
                    System.out.printf("It will take %d years to double your initial investment. ", investment);
                    break;
                } else{
                    System.out.println("Sorry. That's not a valid input. ");
                }
            }else{
                System.out.println("Sorry. That's not a valid input. ");
            }
        }
    }
}