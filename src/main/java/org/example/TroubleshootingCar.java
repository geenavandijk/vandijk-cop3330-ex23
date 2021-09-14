/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Geena-Maria van Dijk
 */

package org.example;

import java.util.Scanner;

public class TroubleshootingCar {

    static public void main (String[] args){
        Scanner input = new Scanner(System.in);

        String answer;

        System.out.println("Is the car silent when you turn the key? ");
        answer = input.next();

        if (answer.equals("y")){
            System.out.println("Are the battery terminals corroded? ");
            answer = input.next();

            if (answer.equals ("y")){
                System.out.println("Your terminals may be dirty.");
                System.out.println("Clean terminals and try starting again.");
            }
            else{
                System.out.println("The battery cables may be damaged.");
                System.out.println("Replace cables and try again.");
            }
            System.exit(0);
        }
        else{
            System.out.println("Does the car make a clicking noise? ");
            answer = input.next();

            if (answer.equals("y")){
                System.out.println("The battery may be drained.");
                System.out.println("Replace the battery.");
                System.exit(0);
            }
            else {
                System.out.println("Does the car crank up but fail to start? ");
                answer = input.next();

                if (answer.equals("y")){
                    System.out.println("Check spark plug connections.");
                    System.exit(0);
                }
                else {
                    System.out.println("Does the engine start and then die? ");
                    answer = input.next();

                    if (answer.equals("y")){
                        System.out.println("Does your car have fuel injections? ");
                        answer = input.next();

                        if (answer.equals("y")){
                            System.out.println("Get it in for service. ");
                            System.exit(0);
                        }
                        else {
                            System.out.println("Check to ensure the choke is opening and closing. ");
                        }
                    }
                    else {
                        System.out.println("This should not be possible. ");
                        System.exit(0);
                    }
                }
            }
        }




    }
}
