package Symbol_count;

import java.util.Scanner;

/*
Write a program that counts symbols from user input, example: 
2
yes
yEP

Output:
y: 2
e: 1
E: 1
s: 1
P: 1
 */

public class symcount 
{
    public static void main(String args[])
    {  
        try (Scanner sc = new Scanner(System.in)) 
        {
            System.out.print("Enter the number of elements you want to store: ");  
            int n=sc.nextInt(); int p=0;  
            String[] arr = new String[n];
            System.out.println("Enter the symbols of the array: ");  
            while (p<n+1) {
                arr[p] = sc.nextLine();
                p++;
            }
            System.out.println("Symbols: ");  
            for(int k=0; k<arr.length;k++){
                System.out.print(arr[k] + ", ");
            }
        }
    }
}
