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
    private final static String URL = "jdbc:mysql://raspberry-murtas.ddns.net:3306/easy?";
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
    
    public static void register(String username, String password, int tavoli, String ristorante) throws Exception
    {
        try(Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement inserisci = conn.prepareStatement("INSERT INTO users (username, password, tavoli, ristorante) VALUES (?, ?, ?, ?)");
            PreparedStatement controlla = conn.prepareStatement("SELECT username FROM users WHERE username = ?"))
        {
            controlla.setString(1, username);
            if(controlla.executeQuery().next()) //Se esiste già un utente con questo username
            {
                throw new Exception("Username già in uso");
            }
            
            inserisci.setString(1, username);
            inserisci.setString(2, password);
            inserisci.setInt(3, tavoli);
            inserisci.setString(4, ristorante);
            
            inserisci.executeUpdate();
        }
        catch(SQLException ex)
        {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void update()
    {
        try(Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement pstmt = conn.prepareStatement("UPDATE users SET tavoli = ?, ristorante = ? WHERE username = ?;");)
        {
            pstmt.setInt(1, Account.getTAVOLI());
            pstmt.setString(2, Account.getRISTORANTE());
            pstmt.setString(3, Account.getUSERNAME());
            pstmt.executeUpdate();
        }
        catch(SQLException ex)
        {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
