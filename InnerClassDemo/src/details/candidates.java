package details;

import java.util.Scanner;

public class candidates {
    private String name, qualification, status;
    private int age;
    public void getcandidatesdetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        name=sc.next();
        System.out.println("Enter Your Qualification: ");
        qualification=sc.next();
        System.out.println("Enter Your Age: ");
        age=sc.nextInt();
        AgeValidation obj=new AgeValidation();
        obj.validateAge();
    }

    private  class AgeValidation {

        public void validateAge() {
            if(age>=21 && age<=25){ 
                status="selected";
            }
            else
            {
                status="rejected";
            }
        }
    }
    public void printCandidateDetails(){
        System.out.println("Name: "+name);
        System.out.println("Qualification: "+qualification);
        System.out.println("Age: "+age);
        System.out.println("Selection Status: "+status);
        
    }
}
