import java.awt.Button;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JComponent;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author aless
 */
public class frmHome extends javax.swing.JFrame {
    
    private boolean logged;
    /**
     * Creates new form Home
     */
    public frmHome() {
        initComponents();
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        
        lblNome.setText(Account.getRISTORANTE());
        
        for(int i = 0; i < Account.getTAVOLI(); i++)
        {
            pnlTavoli.add(new JButton("" + (i + 1)));
        }
        
        for(Component comp : pnlTavoli.getComponents())
        {
            if(comp instanceof JButton)
            {
                JButton btn = (JButton)comp;
                btn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        dlgTavolo finestra = new dlgTavolo(null, true);

                        finestra.setVisible(true);
                    }
                });
            }
        }
    }
    
    public void setLogged(boolean logged)
    {
        this.logged = logged;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lblNome = new javax.swing.JLabel();
        pnlTavoli = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        itmChiudi = new javax.swing.JMenuItem();
        mnuMenù = new javax.swing.JMenu();
        itmModifica = new javax.swing.JMenuItem();
        btnImpostazioni = new javax.swing.JMenu();
        itmAccount = new javax.swing.JMenuItem();
        mnuAiuto = new javax.swing.JMenu();
        itmAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Easy order");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        lblNome.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblNome.setText("Easy order");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        getContentPane().add(lblNome, gridBagConstraints);

        pnlTavoli.setLayout(new java.awt.GridLayout(4, 10, 10, 10));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 31;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(pnlTavoli, gridBagConstraints);

        mnuFile.setText("File");

        jMenuItem1.setText("Logout");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuFile.add(jMenuItem1);

        itmChiudi.setMnemonic('c');
        itmChiudi.setText("Chiudi");
        itmChiudi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmChiudiActionPerformed(evt);
            }
        });
        mnuFile.add(itmChiudi);

        jMenuBar1.add(mnuFile);

        mnuMenù.setText("Menù");

        itmModifica.setText("Modifica");
        itmModifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmModificaActionPerformed(evt);
            }
        });
        mnuMenù.add(itmModifica);

        jMenuBar1.add(mnuMenù);

        btnImpostazioni.setText("Impostazioni");

        itmAccount.setText("Account");
        itmAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAccountActionPerformed(evt);
            }
        });
        btnImpostazioni.add(itmAccount);

        jMenuBar1.add(btnImpostazioni);

        mnuAiuto.setText("Aiuto");

        itmAbout.setText("Su di noi");
        itmAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAboutActionPerformed(evt);
            }
        });
        mnuAiuto.add(itmAbout);

        jMenuBar1.add(mnuAiuto);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itmChiudiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmChiudiActionPerformed
        System.exit(0);
    }//GEN-LAST:event_itmChiudiActionPerformed

    private void itmAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAboutActionPerformed
        dlgAbout about = new dlgAbout(this, true);
        about.setVisible(true);
    }//GEN-LAST:event_itmAboutActionPerformed

    private void itmModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmModificaActionPerformed
        dlgModifica rimuovi = new dlgModifica(this, true);
        rimuovi.setVisible(true);
    }//GEN-LAST:event_itmModificaActionPerformed

    private void itmAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAccountActionPerformed
        dlgRistorante ristorante = new dlgRistorante(this, true);
        ristorante.setVisible(true);
    }//GEN-LAST:event_itmAccountActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Account.logout();
        
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btnImpostazioni;
    private javax.swing.JMenuItem itmAbout;
    private javax.swing.JMenuItem itmAccount;
    private javax.swing.JMenuItem itmChiudi;
    private javax.swing.JMenuItem itmModifica;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JMenu mnuAiuto;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JMenu mnuMenù;
    private javax.swing.JPanel pnlTavoli;
    // End of variables declaration//GEN-END:variables
}
