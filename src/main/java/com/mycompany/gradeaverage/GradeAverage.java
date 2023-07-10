package com.mycompany.gradeaverage;

import java.util.Scanner;

/**
 *
 * @author Farida Fatali
 */
public class GradeAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your Physics grade:");
        int physicsGrade = sc.nextInt();
        
        System.out.println("Enter your Math grade:");
        int mathGrade = sc.nextInt();
        
        System.out.println("Enter your English grade:");
        int englishGrade = sc.nextInt();
        
        System.out.println("Enter your Chemistry grade:");
        int chemistryGrade = sc.nextInt();
        
        System.out.println("Enter your Music grade:");
        int musicGrade = sc.nextInt();
        
        System.out.println("Enter your History grade:");
        int historyGrade = sc.nextInt();
        
        double gradeAverage = (physicsGrade + mathGrade + englishGrade + chemistryGrade + musicGrade + historyGrade) / 6.0;
        
        System.out.println("Your Grade Average is: " + gradeAverage);
        sc.close();
        
        System.out.println("-------------------");
        
        String result = (gradeAverage > 60) ? "Congratulations! You passed" : "Sorry! You failed";
        
        System.out.println(result);
        
    }
}
