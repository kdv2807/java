package classroom;
public abstract class Classroom
{
    int classno;
    String  subname;
    public Classroom()
        {
            System.out.println("This is my class");
        }
public Classroom(String sb, int cn)
        {
            this();
this.subname=sb;
this.classno =cn;  
}

public abstract void disp();

}
