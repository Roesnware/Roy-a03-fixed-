/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Trae Roy
 */
import java.util.Scanner;

public class Solution28 {
    /*
    * make constant scanner 'input'
    * make input method to scan in integers 'inputMethod'
    * make method to loop and get sum from values
        * declare integer variable 'sum' = 0 to keep track of sum
        * declare integer variable 'num' to get value input
        * make for loop i starts at 0, through 5, increment i each loop
        * scan in 'num' input using 'inputMethod'
        * add 'num' value to 'sum'
        * return 'sum'
    * main
    * declare class variable 'sol'
    * declare integer variable 'sum' = calc sum using loop inside 'getSum'
    * print 'The total is 'sum''
    */
    /*
    * Junit 5
    * test getSum make sure adding to sum correctly
    * hardcode in 5 values and make sure it adds correctly
    */
    // constant scanner
    private static final Scanner input = new Scanner(System.in);

    // input
    private int inputMethod(){
        System.out.println("Enter the value: ");
        return input.nextInt();
    }

    // add sum
    public int getSum(int num, int sum){
        sum += num;
        return sum;
    }

    // main
    public static void main(String[] args) {

        Solution28 sol = new Solution28();

        int sum = 0;
        int num;

        for(int i = 0; i < 5; i ++){
            num = sol.inputMethod();
            sum = sol.getSum(num, sum);
        }

        System.out.printf("The total is %d ",sum);
    }
}