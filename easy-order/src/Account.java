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
    
    public static void salvaAccount()
    {
        
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
