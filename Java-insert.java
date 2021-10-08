package youtube;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class MysqlCon{  
	public static void main(String[] args) {
		 
        // creates three different Connection objects
        Connection conn1 = null;
        
 
        try {
            // connect way #1
            String url1 = "jdbc:mysql://localhost:3306/sampledb";
            String user = "root";
            String password = "Sarita@1234";
 
            conn1 = DriverManager.getConnection(url1, user, password);
            if (conn1 != null) {
                System.out.println("Connected to the database sampledb");
            }
 
           
            String sql = "INSERT INTO Users (username, password, fullname, email) VALUES (?, ?, ?, ?)";
            
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, "bill");
            statement.setString(2, "secretpass");
            statement.setString(3, "Bill Gates");
            statement.setString(4, "bill.gates@microsoft.com");
             
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new user was inserted successfully!");
            }

 
            
        } catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
        }
    
	}
}  