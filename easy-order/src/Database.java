/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author aless
 */
public class Database
{
    private final static String URL = "jdbc:mysql://127.0.0.1:3306/easy?";
    private final static String USER = "remote";
    private final static String PASSWORD = "password";
    //private final static String DRIVER = "com.mysql.cj.jdbc.Driver";
    
    /**
     * @param username the username
     * @param password the password
     */
    public static void login(String username, String password)
    {
        try(Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM users WHERE username = ? AND password = ?");)
        {
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            
            ResultSet res = pstmt.executeQuery();
            
            if(res.next())
                Account.setAccount(res);
        }
        catch(SQLException ex)
        {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
