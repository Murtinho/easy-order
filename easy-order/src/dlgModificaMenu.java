
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */

/**
 *
 * @author aless
 */
public class dlgModificaMenu extends javax.swing.JDialog {
    Piatto p;
    dlgModifica m;
    /**
     * Creates new form dlgModificaPiatto
     */
    public dlgModificaMenu(dlgModifica parent, boolean modal, Piatto p) {
        super(parent, modal);
        initComponents();
        
        this.m = parent;
        this.p = p;
        
        txtNome.setText(p.getNome());
        txtDescrizione.setText(p.getDescrizione());
        txtAllergeni.setText(p.getAllergeni());
        spnPrezzo.setValue(p.getPrezzo());
        cbxCategoria.setSelectedItem(p.getCategoria());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblDescrizione = new javax.swing.JLabel();
        txtDescrizione = new javax.swing.JTextField();
        lblAllergeni = new javax.swing.JLabel();
        txtAllergeni = new javax.swing.JTextField();
        lblPrezzo = new javax.swing.JLabel();
        spnPrezzo = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        cbxCategoria = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        btnAnnulla = new javax.swing.JButton();
        btnModifica = new javax.swing.JButton();
        btnRimuovi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(5, 2, 10, 10));

        lblNome.setText("Nome");
        jPanel1.add(lblNome);
        jPanel1.add(txtNome);

        lblDescrizione.setText("Descrizione");
        jPanel1.add(lblDescrizione);
        jPanel1.add(txtDescrizione);

        lblAllergeni.setText("Allergeni");
        jPanel1.add(lblAllergeni);
        jPanel1.add(txtAllergeni);

        lblPrezzo.setText("Prezzo");
        jPanel1.add(lblPrezzo);

        spnPrezzo.setModel(new javax.swing.SpinnerNumberModel(2, 1, 99, 1));
        jPanel1.add(spnPrezzo);

        jLabel1.setText("Categoria");
        jPanel1.add(jLabel1);

        cbxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Antipasti", "Primi", "Secondi", "Pizze", "Dessert", "Bevande" }));
        jPanel1.add(cbxCategoria);

        jPanel2.setLayout(new java.awt.GridLayout(1, 3, 10, 0));

        btnAnnulla.setText("Annulla");
        btnAnnulla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnullaActionPerformed(evt);
            }
        });
        jPanel2.add(btnAnnulla);

        btnModifica.setText("Modifica");
        btnModifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificaActionPerformed(evt);
            }
        });
        jPanel2.add(btnModifica);

        btnRimuovi.setText("Rimuovi");
        btnRimuovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRimuoviActionPerformed(evt);
            }
        });
        jPanel2.add(btnRimuovi);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnnullaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnullaActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnAnnullaActionPerformed

    private void btnModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificaActionPerformed
        try
        {
            p.setNome(txtNome.getText());
            p.setDescrizione(txtDescrizione.getText());
            p.setAllergeni(txtAllergeni.getText());
            p.setCategoria(cbxCategoria.getSelectedItem().toString());
            p.setPrezzo((Integer) spnPrezzo.getValue());
            
            Database.modificaPiatto(p);
            m.aggiornaMenu();
            this.dispose();
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Errore", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnModificaActionPerformed

    private void btnRimuoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRimuoviActionPerformed
        Database.removePiatto(p.getId());
        m.aggiornaMenu();
        this.dispose();
    }//GEN-LAST:event_btnRimuoviActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnulla;
    private javax.swing.JButton btnModifica;
    private javax.swing.JButton btnRimuovi;
    private javax.swing.JComboBox<String> cbxCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAllergeni;
    private javax.swing.JLabel lblDescrizione;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPrezzo;
    private javax.swing.JSpinner spnPrezzo;
    private javax.swing.JTextField txtAllergeni;
    private javax.swing.JTextField txtDescrizione;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}