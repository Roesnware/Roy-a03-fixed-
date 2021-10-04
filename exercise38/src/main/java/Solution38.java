

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Trae Roy
 */
public class Solution38 {
    /*
    * make constant scanner 'input'
    * make input method to scan strings 'inputMEthod'
    * make method to randomize password with given constraints
    * main
    * declare integer variables 'size' 'special' 'numbers' scan input using 'inputMethod'
    * print output resulting password
    */
    // constant scanner
    private static final Scanner input = new Scanner(System.in);

    // input
    private static String inputMethod(String prompt){
        System.out.println(prompt);
        return input.next();
    }

    // make new random pass
    public static String randPass(int length, int special, int nums) {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        String specialCharacters = "!@#$%^&*";

        String numbers = "1234567890";

        Random random = new Random();


        ArrayList<Character> chars = new ArrayList<>();


        for(int i = 0; i < special; i++){
            chars.add(specialCharacters.charAt(random.nextInt(specialCharacters.length())));
        }


        for(int i = 0; i < nums; i++){
            chars.add(numbers.charAt(random.nextInt(numbers.length())));
        }

        for(int i=chars.size()-1; i<length; i++){
            chars.add(letters.charAt(random.nextInt(letters.length())));
        }

        Collections.shuffle(chars);

        StringBuilder password = new StringBuilder();

        for(Character s : chars) {
            password.append(Character.toString(s));
        }
        return password.toString();
    }

    // main
    public static void main(String[] args) {

        int size = Integer.parseInt(inputMethod("What's the minimum length? "));
        int special = Integer.parseInt(inputMethod("How many special characters? "));
        int numbers = Integer.parseInt(inputMethod("How many numbers? "));
        System.out.println("Your password is " + randPass(size, special, numbers));
    }
}