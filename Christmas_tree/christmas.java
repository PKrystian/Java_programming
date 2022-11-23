package Christmas_tree;

import java.util.Scanner;

/*
Write a program that takes a number from user, and prints a Christmas tree with height being user input number
*/

public class christmas {
    public static void main(String args[]){  
        System.out.println("Christmas Tree");
        try (Scanner keyboard = new Scanner (System.in)) {
            int height;
            System.out.print("Enter a number: ");
            height=keyboard.nextInt();
            for(int i=1; i<=height; i++){
                for(int gap=1; gap<=height-i;gap++){
                    System.out.print(" ");
                }
                for(int star=1; star<=i*2-1;star++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }  
}
