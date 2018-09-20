package com.seb;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome!");
        Scanner sc = new Scanner(System.in);


        int number1;
        int number2;
        int sum;

        do {
            System.out.println("Enter the first card number:");
            String cardnumber1 = sc.nextLine();
               if (cardnumber1.equals("J") || cardnumber1.equals("Q") || cardnumber1.equals("K")) {
                   number1 = 10;
               }
               else if (cardnumber1.equals("A")) {
                   System.out.println("Choose from 1 & 11");
                   String a = sc.nextLine();
                   number1 = Integer.parseInt(a);
               }
               else
                   number1 = Integer.parseInt(cardnumber1);

                   System.out.println("Enter the second card number:");
                   String cardnumber2 = sc.nextLine();
               if (cardnumber2.equals("J") || cardnumber2.equals("Q") || cardnumber2.equals("K")) {
                    number2 = 10;
                }
               else if (cardnumber2.equals("A")) {
                    System.out.println("Choose from 1 & 11");
                    String a = sc.nextLine();
                    number2 = Integer.parseInt(a);
                    }
                else
                    number2 = Integer.parseInt(cardnumber2);


                if (number1 == 0 && number2 == 0) {
                    System.out.println("Thank you for playing" + "\nGood Bye");
                    sum=0;
                }

                sum = number1 + number2;
                if (sum == 21) {
                    System.out.println(" * ");

                } else
                    System.out.println("You got:" + sum + "\nTry Again");

            }
            while (sum != 0) ;


        }
    }