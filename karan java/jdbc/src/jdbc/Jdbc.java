package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Jdbc{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
         Class.forName("org.apache.derby.jdbc.ClientDriver");
         Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/jdbcexp", "karan", "1234");
//         System.out.println("Connection Done");
//         String str="Select * from STUDENT";
//         Statement st=con.createStatement();
//         ResultSet rs=st.executeQuery(str);
//         while (rs.next())
//         System.out.println(rs.getString("name"));
           String strn="insert into STUDENT values(?)";
           PreparedStatement pst=con.prepareStatement(strn);
           Scanner sc= new Scanner (System.in);
           System.out.println("Enter Company Name");
           String sname=sc.nextLine();
           pst.setString(1, sname);
           
         
         
    }
    
}
