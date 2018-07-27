package university;

import java.util.Scanner;

public class Student extends person {
    String University;
    String Stream;
    int StudentId;
    public void getdetail(){
        super.getdetail();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Academic Details: ");
        System.out.println("Enter The Course Enrolled ");
        Stream=input.nextLine();
        System.out.println("Enter The Student ID ");
        StudentId=input.nextInt();
        showDetail();
        
        
    }
    public void showDetail(){
        System.out.println("The Details Entered Are: \n");
        System.out.println("First Name"+super.firstname);
        System.out.println("Last Name"+super.lastname);
        System.out.println("Age"+super.age);
        System.out.println("Course Enrolled: "+Stream);
        System.out.println("Student ID: "+StudentId);
        
    }
}
