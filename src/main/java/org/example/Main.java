package org.example;

import java.util.Scanner;

/**
 * Exercise: https://www.youtube.com/watch?v=zOSbq8pjLUw&list=PLEcJSEQK_cD4HTOlqV7xxMH0CYi29adgX&index=20
 * @author Farida Fatali
 */

// Calculating factorial of the number entered by the user

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the factorial number: ");
        int number = scanner.nextInt();

        // USING FOR:
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
            //  for all steps of factorial
            //  System.out.println("The result is: " + factorial);
        }
        System.out.println("The result is: " + factorial);  // for the last result of factorial


        // USING WHILE:
//        int i = 1;
//        int factorial = 1;
//        while (i <= number){
//            factorial *= i;
//        //    for all steps of factorial
//        //    System.out.println("The result is: " + factorial);
//            i++;
//        }
//        // for the last result of factorial
//        System.out.println("The result is: " + factorial);


    }
}