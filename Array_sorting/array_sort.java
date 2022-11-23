package Array_sorting;

import java.util.Scanner;

/*
Write a program that sorts array ascending, from user input
*/

public class array_sort {
    public static void main(String[] args)   
    {  
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of elements you want to store: ");  
            int n=sc.nextInt();  
            int[] arr = new int[n];  
            System.out.println("Enter the elements of the array: ");  
            for(int p=0; p<n; p++)  
            {  
                System.out.print(p + 1 + " Element: ");
                arr[p]=sc.nextInt();  
            }  
            System.out.println("Array elements before sorting:");  
            for(int k=0; k<arr.length;k++){
                System.out.print(arr[k] + " ");
            }
            System.out.println("\nArray elements after sorting:"); 
            for (int i = 0; i < arr.length; i++)   
            {  
                for (int j = i + 1; j < arr.length; j++)   
                {  
                    int tmp = 0;  
                    if (arr[i] > arr[j])   
                    {  
                        tmp = arr[i];  
                        arr[i] = arr[j];  
                        arr[j] = tmp;  
                    }  
                }  
                System.out.print(arr[i] + " ");  
            }
        }  
    }  
}  
