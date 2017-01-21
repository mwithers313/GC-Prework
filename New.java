/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgnew;

import java.util.Scanner;
import java.util.Calendar;

public class New {

    public static void main(String[] args){
       
    Scanner scnr = new Scanner(System.in);
        
    Calendar calendar1 = Calendar.getInstance();
    Calendar calendar2 = Calendar.getInstance();
    
    System.out.println("Enter two dates below to find time difference:");
    
    int a1 = 0;
    int b1 = 0;
    int c1 = 0;
    
    int a2 = 0;
    int b2 = 0;
    int c2 = 0;
    
    System.out.println("PLEASE ENTER START DATE: ");
    System.out.println("Year: ");
    a1 = scnr.nextInt();
    
    System.out.println("Month: ");
    b1 = scnr.nextInt();
    
    System.out.println("Day: ");
    c1 = scnr.nextInt();
    
    System.out.println("PLEASE ENTER FINISH DATE: ");
    System.out.println("Year: ");
    a2 = scnr.nextInt();
    
    System.out.println("Month: ");
    b2 = scnr.nextInt();
    
    System.out.println("Day: ");
    c2 = scnr.nextInt();
    
    calendar1.set(a1,b1,c1);
    calendar2.set(a2,b2,c2);
    
    long milliseconds1 = calendar1.getTimeInMillis();
    long milliseconds2 = calendar2.getTimeInMillis();
    
    long diff = milliseconds2 - milliseconds1;
    long diffSeconds = diff / 1000;
    long diffMinutes = diff / (60 * 1000);
    long diffHours = diff / (60 * 60 * 1000);
    long diffDays = diff / (24 * 60 * 60 * 1000);
    
    System.out.println("Date Difference:");
    
    System.out.println("Time difference in milliseconds: " + diff
 + " milliseconds.");
    
    System.out.println("Time difference in seconds: " + diffSeconds
 + " seconds.");
    
    System.out.println("Time difference in minutes: " + diffMinutes 
+ " minutes.");
    
    System.out.println("Time difference in hours: " + diffHours 
+ " hours.");
    
    System.out.println("Time differnece in days: " + diffDays 
+ " days.");
    }
    }
    
    
    

