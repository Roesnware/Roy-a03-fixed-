/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Trae Roy
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Solution37 {
    /*
     * make constant scanner 'input'
     * make input method to scan integer 'inputMethod'
     * main
     * declare class variable 'sol'
     * declare special characater array list
     * repeat with numbers and letters
     * prompt for min length
     * prompt for special char
     * prompt for size
     * run a for loop for each adding random characters form each repsective domain
     * put into a new array and print secure password
     */
    /*
     * JUnit 5
     * testing not applicable no input is altered
     */
    // constant scanner
    private static final Scanner input = new Scanner(System.in);

    // input
    private int inputMethod(String prompt){
        System.out.println(prompt);
        return input.nextInt();
    }

    //main
    public static void main(String[] args) {

        Solution37 sol = new Solution37();

        List<Character> special = new ArrayList<>();
        String specialChars = "!@#&()–[{}]:;'?/*$^+=<>";
        Random rand = new Random();
        for(char ch: specialChars.toCharArray()){
            special.add(ch);
        }

        String nums = "0123456789";
        for(char ch: specialChars.toCharArray()){
            special.add(ch);
        }
        List<Character> numbers = new ArrayList<>();
        for(char ch: nums.toCharArray()){
            numbers.add(ch);
        }

        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        List<Character> alphabets = new ArrayList<>();
        for(char ch: letters.toCharArray()){
            alphabets.add(ch);
        }


        int len = sol.inputMethod("What's the minimum length? ");
        int specialChar = sol.inputMethod("How many special characters? ");
        int num = sol.inputMethod("How many numbers? ");

        StringBuilder password = new StringBuilder();
        int i;

        for(i = 0; i < len-specialChar-num; i++){
            password.append(alphabets.get(rand.nextInt(alphabets.size())));
        }

        for(i = 0; i < specialChar; i++){
            password.append(special.get(rand.nextInt(special.size())));
        }

        for(i = 0; i < num; i++){
            password.append(numbers.get(rand.nextInt(numbers.size())));
        }

        char[] arr = password.toString().toCharArray();
        for(i = arr.length-1; i > 0; i--){
            int j = rand.nextInt(i + 1);
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        password = new StringBuilder(new String(arr));

        System.out.println("Your password is "+password);
    }
}
