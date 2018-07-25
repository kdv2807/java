package pkgenum;
public class Enum {
    enum WeekDays
    {sun,mon,tue,wed,thur,fri,sat};
    public static void main(String[] args) {
     WeekDays wk; 
  wk = WeekDays.tue; 
  System.out.println("Today is "+wk);
    
}
    
}
