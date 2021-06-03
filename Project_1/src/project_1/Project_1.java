/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_1;

import java.util.Scanner;

/**
 *
 * @author Noah Benson
 */
public class Project_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Hello, what is your name?");
        String name=keyboard.nextLine();
        System.out.println(name+", how many credits do you need in total? ");
        double creditsNeeded= Double.parseDouble(keyboard.nextLine());
        System.out.println(name+", how many credits have you taken?");
        double creditsTaken= Double.parseDouble(keyboard.nextLine());
        double remainingCredits=creditsNeeded-creditsTaken;
        System.out.println(name+", you need "+remainingCredits+" credits to graduate.");
        System.out.println(name+", how many credits do you usually take per semester?");
        double averageCredits= Double.parseDouble(keyboard.nextLine());
        System.out.println(name+", What is your average cost per credit?");
        double costPerCredit= Double.parseDouble(keyboard.nextLine());
        double semesters=Math.ceil(remainingCredits/averageCredits);
        System.out.println(name+", you have approximately "+semesters+" semesters remaining.");
        double remainingCost=Math.ceil(costPerCredit*remainingCredits);
        System.out.println(name+", the cost for the credits until you reach your degree is $"+remainingCost+".");
        
    }
    
}
