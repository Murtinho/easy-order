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
        Account.USERNAME = USERNAME;
    }

    public static String getPASSWORD() {
        return PASSWORD;
    }

    public static void setPASSWORD(String PASSWORD) {
        Account.PASSWORD = PASSWORD;
    }

    public static int getTAVOLI() {
        return TAVOLI;
    }

    public static void setTAVOLI(int TAVOLI) {
        Account.TAVOLI = TAVOLI;
    }

    public static String getRISTORANTE() {
        return RISTORANTE;
    }

    public static void setRISTORANTE(String RISTORANTE) {
        Account.RISTORANTE = RISTORANTE;
    }
    
    
}
