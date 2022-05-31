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
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        btn17 = new javax.swing.JButton();
        btn18 = new javax.swing.JButton();
        btn19 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        itmChiudi = new javax.swing.JMenuItem();
        mnuMenù = new javax.swing.JMenu();
        itmModifica = new javax.swing.JMenuItem();
        btnImpostazioni = new javax.swing.JMenu();
        itmRistorante = new javax.swing.JMenuItem();
        mnuAiuto = new javax.swing.JMenu();
        itmAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Easy order");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        lblNome.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblNome.setText("Pizzeria san martino");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        getContentPane().add(lblNome, gridBagConstraints);

        pnlTavoli.setLayout(new java.awt.GridLayout(2, 10, 10, 10));

        btn1.setText("1");
        pnlTavoli.add(btn1);

        btn2.setText("2");
        pnlTavoli.add(btn2);

        btn3.setText("3");
        pnlTavoli.add(btn3);

        btn4.setText("4");
        pnlTavoli.add(btn4);

        btn5.setText("5");
        pnlTavoli.add(btn5);

        btn6.setText("6");
        pnlTavoli.add(btn6);

        btn7.setText("7");
        pnlTavoli.add(btn7);

        btn8.setText("8");
        pnlTavoli.add(btn8);

        btn9.setText("9");
        pnlTavoli.add(btn9);

        btn10.setText("10");
        pnlTavoli.add(btn10);

        btn11.setText("11");
        pnlTavoli.add(btn11);

        btn12.setText("12");
        pnlTavoli.add(btn12);

        btn13.setText("13");
        pnlTavoli.add(btn13);

        btn14.setText("14");
        pnlTavoli.add(btn14);

        btn15.setText("15");
        pnlTavoli.add(btn15);

        btn16.setText("16");
        pnlTavoli.add(btn16);

        btn17.setText("17");
        pnlTavoli.add(btn17);

        btn18.setText("18");
        pnlTavoli.add(btn18);

        btn19.setText("19");
        pnlTavoli.add(btn19);

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

        itmRistorante.setText("Ristorante");
        itmRistorante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRistoranteActionPerformed(evt);
            }
        });
        btnImpostazioni.add(itmRistorante);

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

    private void itmRistoranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRistoranteActionPerformed
        dlgRistorante ristorante = new dlgRistorante(this, true);
        ristorante.setVisible(true);
    }//GEN-LAST:event_itmRistoranteActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Account.logout();
        
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn17;
    private javax.swing.JButton btn18;
    private javax.swing.JButton btn19;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JMenu btnImpostazioni;
    private javax.swing.JMenuItem itmAbout;
    private javax.swing.JMenuItem itmChiudi;
    private javax.swing.JMenuItem itmModifica;
    private javax.swing.JMenuItem itmRistorante;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JMenu mnuAiuto;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JMenu mnuMenù;
    private javax.swing.JPanel pnlTavoli;
    // End of variables declaration//GEN-END:variables
}
