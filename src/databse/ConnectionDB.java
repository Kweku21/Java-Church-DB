
package databse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Connection conn = null;
public class ConnectionDB {

 
    public static Connection conDB() throws SQLException, ClassNotFoundException{
    
    String url = "jdbc:mysql://localhost/church";

    Connection c = DriverManager.getConnection(url,"root","");

       return c;
       
    }
    
 
    
}
