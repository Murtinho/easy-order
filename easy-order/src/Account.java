
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

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
    
    public static void salvaAccount() throws FileNotFoundException, IOException
    {
        DataOutputStream file = new DataOutputStream(new FileOutputStream("account.dat"));
        
        file.writeUTF(USERNAME);
        file.writeUTF(PASSWORD);
        file.writeInt(TAVOLI);
        file.writeUTF(RISTORANTE);
        
        file.close();
    }
    
    public static void caricaAccount() throws FileNotFoundException, IOException
    {
        DataInputStream file = new DataInputStream(new FileInputStream("account.dat"));
        
        setUSERNAME(file.readUTF());
        setPASSWORD(file.readUTF());
        setTAVOLI(file.readInt());
        setRISTORANTE(file.readUTF());
        
        file.close();
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
}
