/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
import java.util.ArrayList;
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
    
    public static boolean piattoEsiste(Connection conn, Piatto p)
    {
        try(PreparedStatement controlla = conn.prepareStatement("SELECT piatto FROM menu WHERE piatto = ? AND user = ?"))
        {
            controlla.setString(1, p.getNome());
            controlla.setString(2, Account.getUSERNAME());
            
            if(controlla.executeQuery().next()) //Se esiste già un utente con questo username
            {
                return true;
            }
        }
        catch(SQLException ex)
        {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    public static boolean piattoEsiste(Connection conn, Piatto p, int id)
    {
        try(PreparedStatement controlla = conn.prepareStatement("SELECT piatto FROM menu WHERE piatto = ? AND user = ? AND id != ?"))
        {
            controlla.setString(1, p.getNome());
            controlla.setString(2, Account.getUSERNAME());
            controlla.setInt(3, id);
            
            if(controlla.executeQuery().next()) //Se esiste già un utente con questo username
            {
                return true;
            }
        }
        catch(SQLException ex)
        {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    public static void addPiatto(Piatto p) throws Exception
    {
        try(Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement inserisci = conn.prepareStatement("INSERT INTO menu (piatto, user, descrizione, allergeni, categoria, prezzo) VALUES (?, ?, ?, ?, ?, ?)");)
        {
            if(piattoEsiste(conn, p)) //Se esiste già un utente con questo username
            {
                throw new Exception("Piatto già inserito!");
            }
            
            inserisci.setString(1, p.getNome());
            inserisci.setString(2, Account.getUSERNAME());
            inserisci.setString(3, p.getDescrizione());
            inserisci.setString(4, p.getAllergeni());
            inserisci.setString(5, p.getCategoria());
            inserisci.setInt(6, p.getPrezzo());
            
            inserisci.executeUpdate();
        }
        catch(SQLException ex)
        {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Piatto getPiatto(String nome)
    {
        try(Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement get = conn.prepareStatement("SELECT * FROM menu WHERE piatto = ? AND user = ?");)
        {            
            get.setString(1, nome);
            get.setString(2, Account.getUSERNAME());
            
            ResultSet ris = get.executeQuery();
            
            ris.next();
            
            return new Piatto(ris.getInt("id"), ris.getNString("piatto"), ris.getNString("descrizione"), ris.getNString("allergeni"), ris.getNString("categoria"), ris.getInt("prezzo"));
        }
        catch(SQLException ex)
        {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    public static void removePiatto(int id)
    {
        try(Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement delete = conn.prepareStatement("DELETE FROM menu WHERE id = ?");)
        {
            delete.setInt(1, id);
            
            delete.executeUpdate();
        }
        catch(SQLException ex)
        {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void modificaPiatto(Piatto p) throws Exception
    {
        try(Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement pstmt = conn.prepareStatement("UPDATE menu SET piatto = ?, descrizione = ?, allergeni = ?, categoria = ?, prezzo = ? WHERE id = ?;");)
        {
            if(piattoEsiste(conn, p, p.getId()))
                throw new Exception("Il piatto esiste già");
            
            pstmt.setString(1, p.getNome());
            pstmt.setString(2, p.getDescrizione());
            pstmt.setString(3, p.getAllergeni());
            pstmt.setString(4, p.getCategoria());
            pstmt.setInt(5, p.getPrezzo());
            pstmt.setInt(6, p.getId());
            
            pstmt.executeUpdate();
        }
        catch(SQLException ex)
        {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ArrayList<Piatto> getMenu()
    {
        try(Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement get = conn.prepareStatement("SELECT piatto, categoria FROM menu WHERE user = ?");)
        {
            get.setString(1, Account.getUSERNAME());
            
            ResultSet ris = get.executeQuery();
            
            ArrayList<Piatto> menu = new ArrayList<>();
            
            while(ris.next())
                menu.add(new Piatto(ris.getNString("piatto"), ris.getNString("categoria")));
            
            return menu;
        }
        catch(SQLException ex)
        {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
}
