/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Trae Roy
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;


public class Solution39 {
    /*
    * main
    * make employee class variable employees
    * add employees
    * fetch the array list to view all employees
    * print the array
    * function to retreive the first and last name form an employee
    * comparator compare employees by first then last anem
    * sort employees by last name
    * make employee class for employees
    * constructor
    * method to set first name
    * method to get first name
    * method to set last name
    * method to get last name
    * method to set department name
    * method to get department name
    * method to set seperationdate
    * method to get seperationdate
    * method to return employee info
    */

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("John","Johnson","Manager",20161231),
                new Employee("Tou","Xiong","Software Engineer",20161005),
                new Employee("Michaela", "Michaelson", "District Manager", 20151219),
                new Employee("Jake","Jacobson","Programmer", 0),
                new Employee("Jackquelyn", "Jackson", "DBA", 0),
                new Employee("Sally","Webber","Web Developer",20151218)
        };

        // get List view of the Employees
        List<Employee> list = Arrays.asList(employees);

        // display all Employees
        System.out.println("Complete Employee list:");
        list.forEach(System.out::println);

        // Functions for getting first and last names from an Employee
        Function<Employee, String> byFirstName = Employee::getFirstName;
        Function<Employee, String> byLastName = Employee::getLastName;

        // Comparator for comparing Employees by first name then last name
        Comparator<Employee> lastThenFirst = Comparator.comparing(byLastName).thenComparing(byFirstName);

        // sort employees by last name, then first name
        System.out.printf("%nEmployees in ascending order by last name then first:%n");
        list.stream().sorted(lastThenFirst).forEach(System.out::println);
    }
}
//class for each employee
class Employee {
    private String firstName;
    private String lastName;
    private String department;
    private double separationDate;

    // constructor
    public Employee(String firstName, String lastName, String department,double separationDate) {
        setFirstName(firstName);
        setLastName(lastName);
        setDepartment(department);
        setSeparationDate(separationDate);
    }

    // set firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // get firstName
    public String getFirstName() {
        return firstName;
    }

    // set lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // get lastName
    public String getLastName() {
        return lastName;
    }


    // set department
    public void setDepartment(String department) {
        this.department = department;
    }

    // get department
    public String getDepartment() {
        return department;
    }

    public void setSeparationDate(double separationDate) {
        this.separationDate = separationDate;
    }

    // get seperation date
    public double getSeparationDate() {
        return separationDate;
    }

    // return Employee info
    public String toString() {
        return String.format("%-8s %-8s %s %8.0f", getFirstName(), getLastName(), getDepartment(),getSeparationDate());
    }
}

