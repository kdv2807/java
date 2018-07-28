package game;

import java.util.Scanner;

public class hangman {
public void showmenu(){
    int option;
//    Scanner sc=new Scanner(System.in);
//    System.out.println("---------Menu---------"); 
//    System.out.println("1. Play");
//    System.out.println("2. Instructions"); 
//    System.out.println("3. Exit"); 
//    System.out.print("\nChoose the option: "); 
//    option = sc.nextInt(); 
//    
    
String word="india";
int i, flag=0;
String input ,guess = null;
Scanner sc=new Scanner (System.in);
do
{
    
 
System.out.println("Guess The Country Name:  ");
    input =sc.nextLine();
    for (i=0;i<word.length();i++)
    {
        if(word.charAt(i)==input.charAt(0))
        {
            flag=1;
        }
        if (flag==1)
        {
            System.out.println("Yes You Are Correct");
        }
        else
        {
            System.out.println("Sorry Please Try Again");
        }
        System.out.println("Do You Wanna Guess Again");
        guess=sc.nextLine();
        flag=0;
    }
}while(guess.equals("y")||(guess.equals("Y")));


}

}
