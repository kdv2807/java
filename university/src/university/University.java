package university;

import java.util.Scanner;

public class University {
public static void main(String[] args) {
   Scanner choice=new Scanner(System.in);
    System.out.println("Menu");
    System.out.println("1.Student Details");
    System.out.println("2.Employee Details ");
    System.out.println("Enter The Choice: ");
    int a=choice.nextInt();
    switch (a)
    {
        case 1:
            Student st=new Student();
            st.getdetail();
            break;
        case 2:
            employee empl=new employee();
            empl.getdetail();
            break;
    }
}
    
}
