package university;
import java.util.Scanner;
public class person {
    String firstname;
    String lastname;
    int age;
    public void getdetail()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter The Basic Details");
        System.out.println("Enter First Name:");
        firstname=input.nextLine();
        System.out.println("Enter Last Name:");
        lastname=input.nextLine();
        System.out.println("Enter Age:");
        age=input.nextInt();
        
        
                
        
    }
    
}
