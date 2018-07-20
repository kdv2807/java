package classroom;
public class student extends Classroom
{
 
 public student(String sb, int cn)
 {
 super(sb,cn);
 }
 
 @Override
 public void disp()
 {
     System.out.println("Name of subject :" +subname);
     System.out.println("Class no :" +classno);
 }
 }
class edu
         {
 public static void main(String args[])
 {
 student s = new student("java",12);
 s.disp();
 }
}

