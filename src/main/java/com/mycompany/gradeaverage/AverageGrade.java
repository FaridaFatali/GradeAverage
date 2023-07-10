package com.mycompany.gradeaverage;

import java.util.Scanner;

/**
 *
 * @author Farida Fatali
 */

/* Get 6 subject grades from the student, find its average.
If the result is above 60, he passed, if it is down, he failed and do this without using if else.
*/

public class AverageGrade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int physics, math, english, chemistry, music, history;
        double average;
        
        System.out.println("Enter your Physics grade: ");
        physics = scanner.nextInt();
        
        System.out.println("Enter your Math grade: ");
        math = scanner.nextInt();
        
        System.out.println("Enter your English grade: ");
        english = scanner.nextInt();
        
        System.out.println("Enter your Chemistry grade: ");
        chemistry = scanner.nextInt();
        
        System.out.println("Enter your Music grade: ");
        music = scanner.nextInt();
        
        System.out.println("Enter your History grade: ");
        history = scanner.nextInt();
        
        average = (physics + math + english + chemistry + music + history) / 6.0;
        System.out.println("Your average grade: " + average);
        
        System.out.println("----------------------");
        
        String pass = "Congratulations! You passed";
        String fail = "Sorry! You failed";
        
        String result = (average >= 60) ? pass : fail ; 
        
        System.out.println(result);

    }
}
