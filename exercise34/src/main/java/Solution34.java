/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Trae Roy
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution34 {
    /*
    * make constant scanner 'input'
    * make String method 'inputMethod' to scan String input
    * make void method 'outputMethod' to print the remaining string of employees
    * main
    * make class variable 'sol'
    * declare Array list variable employees
    * print starting employees
    * prompt for which employee to remove
    * print new line
    * print output
    */
    /*
    * JUnit 5
    * no method unit to test all input/output based
    */
    // constant scanner
    private static final Scanner input = new Scanner(System.in);

    // input
    private String inputMethod(){
        System.out.println("Enter an employee name to remove: ");
        return input.next();
    }

    // print output
    public void outputMethod(ArrayList<String> employees) {
        System.out.println("There are "+employees.size()+" employees: ");
        for(String emp:employees) {
            System.out.println(emp);
        }
    }
    // main
    public static void main(String[] args) {
        Solution34 sol = new Solution34();

        ArrayList<String> employees = new ArrayList<>(Arrays.asList("Clark Kent", "Peter Parker", "Bruce Banner", "Tony Stark", "Bruce Wayne", "Carol Denvers", "Billy Batson"));
        sol.outputMethod(employees);

        System.out.println();
        String employee = sol.inputMethod();

        employees.remove(employee);

        System.out.println();
        sol.outputMethod(employees);
    }
}
