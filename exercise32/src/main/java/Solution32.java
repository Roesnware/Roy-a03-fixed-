/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Trae Roy
 */

import java.util.Scanner;

public class Solution32 {
    /*
    * make constant scanner 'input'
    * make String method to scan input for difficulty 'inputMethod'
    * make String input method to scan for guesses 'inputMethod2'
    * make boolean method to check if the provided input is numeric or not 'checkDigits'
        * return true for numeric
        * else return false
    * make String method to scan in whether they want to play again or not 'inputMethod3'
    * main
    * make class variable 'sol'
    * print opening statement 'Let's play Guess the Number! '
    * initilaize variables
    * while loop for game to loop if user wants at end
    * initalize 'counter'
    * while loop for numeric value of 'difficulty'
        * if numeric parse to integer and break out
        * otherwise prompt for a numeric value
    * using 'difficulty' set random number accordingly
    * prompt thta you are ready
    * prompt for 'guess'
    * while loop to check if 'guess' is a numeric value
        * if so parse it to integer and increment 'counter'
        * otherwise prompt for numeric value and increment 'counter'
    * using 'guess' pormpt hints
    * if too high prompt too high
    * if too low prompt too low
    * if 'guees' = 'randomnum' you guessed it print how many guesses
    * prompt if they want to play again
    */
    /*
     * JUnit 5
     * test checkDigits
     * hardcode nonnumeric char into string
     * should return false
     */
    // constant scanner
    private static final Scanner input = new Scanner(System.in);

    // for difficulty input
    private String inputMethod(){
        System.out.println("Enter the difficulty level(1, 2, or  3): ");
        return input.next();
    }

    // for guesses input
    private String inputMethod2(){
        return input.next();
    }

    // check if digits
    public boolean checkDigits(String str) {

        try {
            Integer.parseInt(str);
        }catch(Exception e) {
            return false;
        }
        return true;
    }

    // for redo input
    private char inputMethod3(){
        System.out.println("\nDo you wish to play again (Y/N)?  ");
        return input.next().charAt(0);
    }

    // main
    public static void main(String[] args) {

        Solution32 sol = new Solution32();

        System.out.println("Let's play Guess the Number!");
        int randomNum;
        String guess;
        int guessNum;
        int counter;
        String key;
        int difficulty;

        while(true) {

            counter = 0;

            while (true) {

                key = sol.inputMethod();

                if (sol.checkDigits(key)) {
                    difficulty = Integer.parseInt(key);
                    break;
                } else {
                    System.out.println("Please enter a numeric value.");
                }
            }

            if (difficulty == 1) {
                randomNum = (int) (Math.random() * 10 + 1);
            } else if (difficulty == 2){
                randomNum = (int) (Math.random() * 100 + 1);
            }else {
                randomNum = (int) (Math.random() * 1000 + 1);
            }

            System.out.print("I have my number now. What's your guess? ");
            do{
                while(true){

                    guess = sol.inputMethod2();

                    if (sol.checkDigits(guess)){
                        guessNum = Integer.parseInt(guess);
                        counter++;
                        break;
                    }else{
                        System.out.println("Please enter a numeric value.");
                        counter++;
                    }
                }

                if (guessNum == randomNum){
                    System.out.printf("You got it in %d guesses!", counter);
                }else if(guessNum > randomNum){
                    System.out.println("Too high. Guess again: ");
                }else{
                    System.out.println("Too low. Guess again: ");
                }
            }while (guessNum != randomNum);

            char again = sol.inputMethod3();
            if(again == 'N' || again == 'n')
                break;
        }
    }
}