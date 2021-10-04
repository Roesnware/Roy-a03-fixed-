/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Trae Roy
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Solution36 {
    /*
    * make constant scanner 'input'
    * make constant global array list 'array'
    * make input method to scan in strings
    * make method to get min out of arraylist 'getMin'
    * make method to get max out of arraylist 'getMax'
    * make method to get average out of arraylist 'getAverage'
    * make method to get standard deviation out of arraylist 'getSD'
    * make output method
    * main
    * declare class variable 'sol'
    * declare 'string' variable
    * declare 'num' for value input variable
    * while loop to continue scanning int and checking if they are integers
    * print 'numbers' in array list
    * calc 'min' using 'getMin'
    * calc 'max' using 'getMax'
    * calc 'avg' using 'getAverage'
    * calc 'stddev' using 'getSD'
    */
    /*
     * JUnit 5
     * input is not altered no test cases
     */
// constant scanner
    private static final Scanner input = new Scanner(System.in);

    private static ArrayList<Integer> array;

    // input
    private String inputMethod(){
        System.out.println("Enter a number: ");
        return input.next();
    }

    // calc min
    public int getMin() {
        int size = array.size();
        if(size == 0) {
            return 0;
        }

        int min = array.get(0);

        int i;
        for(i = 1; i < size; i++) {
            if(min > array.get(i)) {
                min = array.get(i);
            }
        }
        return min;
    }

    // calc max
    public int getMax() {
        int size = array.size();
        if(size == 0) {
            return 0;
        }

        int max = array.get(0);

        int i;
        for(i = 1; i < size; i++) {
            if(max < array.get(i)) {
                max = array.get(i);
            }
        }
        return max;
    }

    // calc average
    public double getAverage() {
        double avg = 0;
        for (Integer integer : array) {
            avg = avg + integer;
        }
        avg = avg/array.size();
        return avg;
    }

    // calc standard deviation
    public double getSD() {
        double sum = 0;
        double stdDev = 0.0;
        double avg;
        int size = array.size();

        for (Integer integer : array) {
            sum = sum + integer;
        }

        avg = sum / (size);

        for (Integer integer : array) {
            double x = integer - avg;
            stdDev = stdDev + Math.pow(x, 2);
        }

        return Math.sqrt(stdDev / size);
    }

    // output
    public void output() {
        System.out.print("Numbers: ");
        int size = array.size();
        int i;
        for(i = 0; i < size; i++) {
            if(i != size - 1) {
                System.out.print(+array.get(i) + ", ");
            }else {
                System.out.println(array.get(i));
            }
        }
    }

    // main
    public static void main(String[] args) {
        Solution36 sol = new Solution36();

        array = new ArrayList<>();

        String str;
        int num;
        while(true) {

            str = sol.inputMethod();
            if(str.equals("done")) {
                break;
            }else {
                num = 1;
                int i;
                for(i = 0; i < str.length(); i++) {
                    if(Character.isDigit(str.charAt(i))) {
                        continue;
                    }else {
                        num = 0;
                    }
                }if(num == 1) {
                    array.add(Integer.parseInt(str));
                }
            }

        }
        sol.output();
        double avg =  sol.getAverage();
        System.out.println("The average is "+avg+"");
        int min = sol.getMin();
        System.out.println("The minimum is "+min+"");
        int max = sol.getMax();
        System.out.println("The max is "+max+"");
        double stddev = sol.getSD();
        System.out.println("The standard deviation is "+stddev+"");
    }
}
