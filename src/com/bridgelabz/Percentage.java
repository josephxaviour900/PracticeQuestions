package com.bridgelabz;

import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        System.out.println(" enter your marks ");
        Scanner scanner = new Scanner(System.in);
        int marks = scanner.nextInt();
        if (marks>100 || marks<0)
            System.out.println(" invalid input ");
        else if (marks>75)
        {
            System.out.println(" first class with distinction");
        }
        else if (marks>=60 && marks<75){
            System.out.println("first class");
        }
        else if (marks>=50 && marks<60)
        {
            System.out.println("second class");
        } else if (marks>=35 && marks<50) {
            System.out.println("just pass");
        }
        else
            System.out.println(" failed ");

    }
}

