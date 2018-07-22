package employee;
public class Employee {
    public static void main(String[] args) {
        int option;
        System.out.println("----Menu----");
        System.out.println("1.Enter Data");
        System.out.println("2.Diplay Data");
        System.out.println("----Exit----");
        System.out.println("\nChoose the option\n");
        option=2;
        switch(option){
            case 1:
            EnterData();
            break;
                case 2:
            Display Data();
            break;
                case 3:
                    Exit();
                    break;
                    
                
                    
        }
         
    }
    
}
