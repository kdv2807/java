package arrayconcept;
public class Arrayconcept {
public static void main(String[] args) {
    String s="Karan";
    String s1="Vishwakarma";
       
    char c='K';
    System.out.println(s.length());
    System.out.println(s.charAt(4));
    System.out.println(s.indexOf(c));
    System.out.println(s.concat(s1));
    System.out.println(s.equals(s1));
    System.out.println(s.compareTo(s1));
    int t=s.compareTo(s1);
    if(t==0)
    {
        System.out.println("Same");
    }
    else
        System.out.println("Not Same");
    boolean b=s.equals(s1);
    if (b)
        System.out.println("Same");
    else
        System.out.println("Not Same");
}
    
}
