/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Trae Roy
 */

public class Solution30 {
    /*
    * make method to create a multiplication table 'multTable'
        * declare integer variables 'i' and 'j'
        * run for loop for num row starting at 1; through 12; increment each loop
            * run for loop for num colomns starting at 1; through 12; increment each loop
            * print ''i' * 'j''
        * print new line
        * main
        * declare class variable 'sol'
        * call 'multTable' to print multiplication table
    */
    /*
     * JUnit 5
     * nothing to test? just printing a table
     */
// multiplication table method
    public void multTable(){
        int i, j;
        for(i = 1; i <= 12; i++){
            for(j = 1; j <= 12; j++){
                System.out.format("%4d",i * j);
            }
            System.out.println();
        }
    }

    // main
    public static void main(String[] args) {
        Solution30 sol = new Solution30();

        sol.multTable();
    }
}
