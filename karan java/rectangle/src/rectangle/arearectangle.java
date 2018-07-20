package rectangle;
public class arearectangle extends rectangle 
{
 public arearectangle(int l, int b)
 {
 super(l,b);
 }
 @Override
 public void disp()
 {
     System.out.println("the length of rectangle: " +length);
      System.out.println("the breadth of rectangle: " +breadth);
      System.out.println("the breadth of rectangle: " +(length * breadth));
 }
}
class area 
{
public static void main(String args[])
{
arearectangle a = new arearectangle( 20,40);
a.disp();
}

}