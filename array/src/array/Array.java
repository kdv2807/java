package array;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner sc=new Scanner (System.in);
        for (int i=0; i<5;i++){
            System.out.println("Enter A Number");
            a[i]=sc.nextInt();
        }
        for(int i:a)
        {
            System.out.println("Value is"+i);
        }
    }
    
}
