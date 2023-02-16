
package employee.management.system;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conn {
    
    Connection conn;
    Statement stmt;
    
    static final String DBURL = "jdbc:mysql://localhost:3306/employee-management-system";
    static final String DBUSER = "root";
    static final String DBPWD = "2e77Qf$S^4NG#Qe";
    
    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(DBURL, DBUSER, DBPWD);
            System.out.println("connection is established.");
            
            stmt = conn.createStatement();
            
            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(Conn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
