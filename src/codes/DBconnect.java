/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;

import com.mysql.jdbc.Driver;
import javax.swing.JOptionPane;
import java.sql.*;
import java.sql.Connection;


/**
 *
 * @author Heshan
 */
public class DBconnect {
    
    public static Connection connect(){
        
        Connection conn = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student m.system","root","");
            
            
        } catch (Exception e) {
            
            JOptionPane.showConfirmDialog(null, e);
            
        }
        
        
        return conn;
        
    }
    
}
