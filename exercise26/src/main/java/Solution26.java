/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;
import java.lang.Math;

public class Solution26 {
    /*
     * make a constant scanner 'input'
     * make an output method to inform resulting 'numMonths' til card is paid off 'outputMethod1'
     * make method to scan in double String 'input'
     * make method for calc the numMonths 'getMonths'
        * calc months left using formula ( -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i))
        * return 'months'
     * make main method
     * create class variable 'sol'
     * declare double variable 'balance' = scan in car balance using 'inputMethod'
     * declare double variable 'APR' = scan in yearly APR using 'inputMethod'
     * declare double variable 'payment' = scan in monthly payment using 'inputMethod'
     * declare integer variable 'numMonths' = calc months using 'getMonths'
     * print out using 'outputMethod1'
     */
    /*
     * Junit 5
     * getMonthsTest()
     * test ans = getMonths(5000, 12, 200)
         * expected = 70
         * if expected = ans, should be false
     */
    private final Scanner input = new Scanner(System.in);

    public void outputMethod1(int months){
        System.out.println("It will take you " +months+ " months to pay off this card. ");
    }

    public double inputMethod(String prompt){
        System.out.println(prompt);
        return input.nextDouble();
    }

    public int getMonths(double balance, double APRYearly, double paymentMonthly){
        //n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
        APRYearly = (APRYearly / 365.0);
        double v = balance/paymentMonthly;
        double x = (1.0 + v);
        double t = (1.0 + APRYearly);
        double y = Math.pow((t), 30.0);
        double w = (1.0 - y);
        double z = x*w;
        double n = Math.log(z);
        double r = Math.log(t);
        double s = n/r;
        double f = (-1.0/30.0);
        return (int) (f * s);
    }

    public static void main(String[] args) {

        Solution26 sol = new Solution26();

        double balance = sol.inputMethod("What is your balance? ");
        double APR = sol.inputMethod("What is the APR on the card (as a percent)? ");
        double payment = sol.inputMethod("What is the monthly payment you can make? ");

        APR = APR/100;
        int numMonths = sol.getMonths(balance, APR, payment);
        sol.outputMethod1(numMonths);
    }
}
