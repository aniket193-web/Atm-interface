package ASimulatorSystem;

import java.sql.*;  
import java.sql.Connection;  
import java.sql.DriverManager;  
public class conn {
    Connection c;
    Statement s;
    public conn(){  
        try{  
        	  Class.forName("com.mysql.jdbc.Driver");  
        	  String url="jdbc:mysql://127.0.0.1:3306/atm?characterEncoding=utf8";  
        	  String name="root";  
        	  String pass="root";  
              c = DriverManager.getConnection(url,name,pass);
            s =c.createStatement(); 
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  