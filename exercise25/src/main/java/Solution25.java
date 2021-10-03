/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Trae Roy
 */


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution25 {
    /*
    * make constant scanner variable 'input'
    * make input method to get password 'inputMethod'
    * make output method to print out output cases 'outMethod'
    * make boolean method 'checkDigits'
        * return 'true' if 'password' is all digits and < 8
        * else return 'false'
    * make boolean method 'checkLetters'
        * return 'true' if 'password' is all letters and < 8
        * else return 'false'
    * make boolean method 'checkDigLet'
        * return 'true' if the 'password' has numbers, and letters and is >= 8
        * else return 'false'
    * make boolean method 'checkAll'
        * return 'true' if the 'password' has special char, numbers, and letters and is >= 8
        * else return 'false'
    * make integer method 'passwordValidator'
        * return the 'val' corresponding to 'strength' of 'password'
    * make method for getting 'strength' value from 'passwordValidator' to specify output case 'getStrength'
        * run each condition and return relative strength {1-4} 4 being the very strong and 1 being very weak
    * main method
    * declare a class variable 'sol'
    * declare string 'password' = scan string input using 'inputMethod'
    * run 'outputMethod' to complete task and get output
    */
    /*
     * Junit 5 test
     * make boolean method 'checkDigits'
        * return 'true' if 'password' is all digits and < 8
        * make string == 123456789 should be false too many characters
     * make boolean method 'checkLetters'
        * return 'true' if 'password' is all letters and < 8
        * make string == abcd12 should be false numbers in password
     * make boolean method 'checkDigLet'
        * return 'true' if the 'password' has numbers, and letters and is >= 8
        * make string == abcd!12345 should be false special character
     * make boolean method 'checkAll'
        * return 'true' if the 'password' has special char, numbers, and letters and is >= 8
        * make string == abcd! should be false to little characters
     */
    // constant scanner
    private static final Scanner input = new Scanner(System.in);

    // input
    private String inputMethod(){
        System.out.println("What is your password: ");
        return input.nextLine();
    }

    // 1 form of output
    private void outputMethod(String password, String strength){
        System.out.printf("The password %s is a %s password.", password, strength);
    }
    // method condition for dig
    public boolean checkDigits(String password, int passLen) {
        int i;
        if(passLen < 8){
            for(i = 0; i < passLen; i++){
                return Character.isDigit(password.charAt(i));
            }
        }
        return false;
    }
    // method condition for letters
    public boolean checkLetters(String password, int passLen){
        int i;
        if(passLen < 8){
            for(i = 0; i < passLen; i++){
                return Character.isLetter(password.charAt(i));
            }
        }
        return false;
    }
    // method condition for num and letters
    public boolean checkDigLet(String password, int passLen){
        if(passLen >= 8){
            Pattern letters = Pattern.compile("[a-zA-z]");
            Pattern digits = Pattern.compile("[0-9]");
            Pattern specials = Pattern.compile("[^a-zA-Z0-9]");

            Matcher hasLetter = letters.matcher(password);
            Matcher hasDigit = digits.matcher(password);
            Matcher hasSpecial = specials.matcher(password);

            return hasLetter.find() && hasDigit.find() && !hasSpecial.find();
        }
        return false;
    }
    // method condition for special char
    public boolean checkAll(String password, int passLen){
        if(passLen >= 8){
            Pattern specials = Pattern.compile("[^a-zA-Z0-9]");
            Pattern letters = Pattern.compile("[a-zA-z]");
            Pattern digits = Pattern.compile("[0-9]");

            Matcher hasLetter = letters.matcher(password);
            Matcher hasDigit = digits.matcher(password);
            Matcher hasSpecial = specials.matcher(password);

            return hasSpecial.find() && hasDigit.find() && hasLetter.find();
        }
        return false;
    }
    // for strength output
    public int passwordValidator(String password){
        int val = 0;

        Solution25 sol = new Solution25();

        if(sol.checkDigits(password, password.length())){
            val = 1;
        } else if(sol.checkLetters(password, password.length())){
            val = 2;
        } else if(sol.checkDigLet(password, password.length())){
            val = 3;
        } else if(sol.checkAll(password, password.length())){
            val = 4;
        }
        return val;
    }
    // for strength output
    public String getStrength(String password){
        Solution25 sol = new Solution25();
        String strength = null;
        if(sol.passwordValidator(password) == 1){
            strength = "very weak";
        }else if(sol.passwordValidator(password) == 2){
            strength = "weak";
        }else if(sol.passwordValidator(password) == 3){
            strength = "strong";
        }else if(sol.passwordValidator(password) == 4){
            strength = "very strong";
        }
        return strength;
    }
    // main
    public static void main(String[] args) {
        Solution25 sol = new Solution25();

        String password = sol.inputMethod();

        sol.outputMethod(password,sol.getStrength(password));
    }
}
