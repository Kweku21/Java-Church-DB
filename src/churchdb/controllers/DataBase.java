
package churchdb.controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DataBase {
    
    

    public DataBase() throws SQLException {
        
        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Church ", "kweku", "kweku");
    }
    
}
