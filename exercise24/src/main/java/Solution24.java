/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Trae Roy
 */

import java.util.Arrays;
import java.util.Scanner;

public class Solution24{
    /*
    * declare constant scanner 'input'
    * make an input method to take in and return the strings 'inputMethod'
    * make an output method for case 1, they are not anagrams 'outMethod'
    * make an output method for case 2, they are anagrams 'outMethod2'
    * make a method that takes in the 2 strings and compares them 'isAnagram'
        * redeclare 'string1' and 'string2'
        * make sure they are same length otherwise they aren't anagrams
        * declare a boolean variable 'status'
        * if('string1' length != 'string2' length)
            * automatically set 'status' = false
        * otherwise
            * make an array for string1 all lower case for comparison 'Str1'
            * make an array for string2 all lower case for comparison 'Str2'
            * sort both arrays 'Str1' & 'Str2'
            * set status to their comparison
       * return 'status'
    * main method
    * create a class variable 'sol'
    * print 'Enter two strings and I'll tell you if they are anagrams: '
    * declare string variable 'string1' = scan in using 'inputMethod'
    * declare string variable 'string2' = scan in using 'inputMethod'
    * if ( 'isAnagram' 'status' return true )
        * print output for case 2 using 'outputMethod2'
    * else
        * print output for case 1 using 'outputMethod'
     */

    /*
     * Junit 5 Testing:
     * test isAnagrams method
     * make sure the method handles strings correctly
     * if they are anagrams return true otherwise
     * expected to return false
     */
    // constant scanner
    private static final Scanner input = new Scanner(System.in);

    // input
    private String inputMethod(String prompt){
        System.out.println(prompt);
        return input.nextLine();
    }

    // 2 forms of output
    private void outputMethod(String string1, String string2){
        System.out.println(string1 + " and " + string2 + " are not anagrams");
    }

    private void outputMethod2(String string1, String string2){
        System.out.println(string1 + " and " + string2 + " are anagrams");
    }

    // need junit test
    public boolean isAnagram(String string1, String string2) {
        String s1 = string1.replaceAll("\\s", "");
        String s2 = string2.replaceAll("\\s", "");
        boolean status;
        if (s1.length() != s2.length()) {
            status = false;
        }else {
            char[] Str1 = s1.toLowerCase().toCharArray();
            char[] Str2 = s2.toLowerCase().toCharArray();
            Arrays.sort(Str1);
            Arrays.sort(Str2);
            status = Arrays.equals(Str1, Str2);
        }
        return status;
    }

    // main
    public static void main(String[] args) {
        Solution24 sol = new Solution24();

        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");

        String string1 = sol.inputMethod("Enter the first string: ");
        String string2 = sol.inputMethod("Enter the second string: ");

        if(sol.isAnagram(string1, string2)){
            sol.outputMethod2(string1, string2);
        }else{
            sol.outputMethod(string1, string2);
        }
    }

}