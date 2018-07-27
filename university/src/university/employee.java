package university;

import java.util.Scanner;

public class employee extends person {
    double Salary;
    String desg;
    String dept;
    public  void getdeatail () {
        super.getdetail();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter The Professional Details");
        System.out.println("Enter The Department: ");
        dept=input.nextLine();
        System.out.println("Enter The Designation: ");
        desg=input.nextLine();
        System.out.println("Enter The Salary: ");
        Salary=input.nextInt();
}

public void showdetail()
{
    System.out.println("The Details Entered Are  :-\n");
    System.out.println("First Name: "+super.firstname);
    System.out.println("Last Name: "+super.lastname);
    System.out.println("Age: "+super.age);
    System.out.println("Department: "+dept);
    System.out.println("Designation: "+desg);
    System.out.println("Salary: "+Salary);
}
    
}
