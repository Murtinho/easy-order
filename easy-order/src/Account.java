
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aless
 */
public class Account
{
    private static String USERNAME;
    private static String PASSWORD;
    private static int TAVOLI;
    private static String RISTORANTE;
    private static boolean logged;
    
    public static void salvaAccount() throws FileNotFoundException, IOException
    {
        DataOutputStream file = new DataOutputStream(new FileOutputStream("account.dat"));
        
        file.writeUTF(USERNAME);
        file.writeUTF(PASSWORD);
        
        file.close();
    }
    
    public static void caricaAccount() throws FileNotFoundException, IOException
    {
        String user, pass;
        
        DataInputStream file = new DataInputStream(new FileInputStream("account.dat"));
        
        user = file.readUTF();
        pass = file.readUTF();
        
        Database.login(user, pass);
        
        file.close();
    }
    
    public static void logout()
    {
        File account = new File("account.dat");
        
        account.delete();
    }
    
    public static void setAccount(ResultSet account) throws SQLException
    {
        setUSERNAME(account.getNString("username"));
        setPASSWORD(account.getNString("password"));
        setTAVOLI(account.getInt("tavoli"));
        setRISTORANTE(account.getNString("ristorante"));
        logged = true;
    }

    public static String getUSERNAME() {
        return USERNAME;
    }

    public static void setUSERNAME(String USERNAME) {
        if(USERNAME != null)
            Account.USERNAME = USERNAME;
    }

    public static String getPASSWORD() {
        return PASSWORD;
    }

    public static void setPASSWORD(String PASSWORD) {
        if(PASSWORD != null)
            Account.PASSWORD = PASSWORD;
    }

    public static int getTAVOLI() {
        return TAVOLI;
    }

    public static void setTAVOLI(int TAVOLI) {
        if(TAVOLI > 0)
            Account.TAVOLI = TAVOLI;
    }

    public static String getRISTORANTE() {
        return RISTORANTE;
    }

    public static void setRISTORANTE(String RISTORANTE) {
        if(RISTORANTE != null)
            Account.RISTORANTE = RISTORANTE;
    }
    
    public static boolean isLogged() {
        return logged;
    }
}
