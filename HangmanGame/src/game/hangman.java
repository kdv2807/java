package game;

import java.util.Scanner;
import java.util.Random;
public class hangman {
public void playgame(){
//    int option;
//    Scanner sc=new Scanner(System.in);
//    System.out.println("---------Menu---------"); 
//    System.out.println("1. Play");
//    System.out.println("2. Instructions"); 
//    System.out.println("3. Exit"); 
//    System.out.print("\nChoose the option: "); 
//    option = sc.nextInt(); 
//    
    
//String word="india";
//int i, flag=0;
//String input ,guess = null;
//Scanner sc=new Scanner (System.in);
//do
//{
//    
// 
//System.out.println("Guess The Country Name:  ");
//    input =sc.nextLine();
//    for (i=0;i<word.length();i++)
//    {
//        if(word.charAt(i)==input.charAt(0))
//        {
//            flag=1;
//        }
//        if (flag==1)
//        {
//            System.out.println("Yes You Are Correct");
//        }
//        else
//        {
//            System.out.println("Sorry Please Try Again");
//        }
//        System.out.println("Do You Wanna Guess Again");
//        guess=sc.nextLine();
//        flag=0;
//    }
//}while(guess.equals("y")||(guess.equals("Y")));

String Word[]={"india","qatar","usa","uae"};
int len, i, count = 0, rnd, flag =0; 
String choice, temp; 
Random rd = new Random(); 
Scanner input = new Scanner(System.in); 
rnd = rd.nextInt(6); 
len = Word[rnd].length();
char[] newString = new char[len];
StringBuffer wrgString = new StringBuffer(); 
for(int j = 0; j < len; j++) 
    { 
       System.out.print("_ "); 
    }
System.out.println(); 
do{
    flag =0; 
    System.out.print("\n\nEnter your guess: ");
    String ch = input.nextLine().toLowerCase();
    count++;
    for (i = 0; i < len; i++) 
    {
        if (Word[rnd].charAt(i) == ch.charAt(0))
        {
            newString[i] = Word[rnd].charAt(i); 
            flag = 1; 
        }
    }
    if (flag == 0)
    {
         flag=1; 
         wrgString.append(ch + ","); 
         System.out.println("\nMisses: " + wrgString); 
    }
    System.out.println(newString);
    temp = new String(newString); 
    if (Word[rnd].equals(temp)) 
    {
        System.out.println("Congrats You Won");
        System.out.println("Do you want to play again (Y/N)");
        choice = input.nextLine();
        if (choice.equalsIgnoreCase("y")) 
        {
            playgame();
        }
       
    }
}while(flag!=0);
}

}
