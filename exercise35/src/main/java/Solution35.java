/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Trae Roy
 */


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Solution35 {
    /*
    * make constant scanner input
    * make input method to scan in String inputMethod
    * main
    * declare class variable sol
    * initialize string variable 'name'
    * declare array list variable 'names'
    * do-while loop to scan until empty space
    * set 'names' to user input using 'inputMethod'
    * add input 'name' to array list 'names'
    * remove the empty space from index
    * pick a random 'winner' in 'winner' variable
    * print 'The winner is... 'winner' '
    */
    /*
     * JUnit 5
     * no method to test strictly random and input/output
     */
    // constant scanner
    private static final Scanner input = new Scanner(System.in);

    // input
    private String inputMethod(){
        System.out.println("Enter a name: ");
        return input.next();
    }

    // main
    public static void main(String[] args) {
        Solution35 sol = new Solution35();

        String name;

        ArrayList<String> names = new ArrayList<>();
        Random rand = new Random();

        do {
            name = sol.inputMethod();
            names.add(name);
        }while(!name.isEmpty());

        names.remove(names.size() - 1);

        String winner = names.get(rand.nextInt(names.size()));
        System.out.printf("The winner is... %s", winner);
    }
}