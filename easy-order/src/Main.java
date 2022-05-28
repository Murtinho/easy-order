
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aless
 */
public class Main
{
    private boolean logged;
    
    public static void main(String args[])
    {
        Main main = new Main();
        dlgLogin login = new dlgLogin(main);
        login.setVisible(true);
        
        login.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                if(!main.isLogged())
                    System.exit(0);
                
                frmHome home = new frmHome();
                home.setVisible(true);
            }
        });
    }
    
    public void setLogged(boolean logged)
    {
        this.logged = logged;
    }
    
    public boolean isLogged()
    {
        return logged;
    }
}
