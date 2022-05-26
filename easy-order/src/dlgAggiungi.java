/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */

/**
 *
 * @author aless
 */
public class dlgAggiungi extends javax.swing.JDialog {

    /**
     * Creates new form dlgAggiungi
     */
    public dlgAggiungi(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
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
        txtPrezzo = new javax.swing.JTextField();
        lblCategoria = new javax.swing.JLabel();
        cbxCategoria = new javax.swing.JComboBox<>();
        btnAnnulla = new javax.swing.JButton();
        btnAggiungi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Aggiungi");

        jPanel1.setLayout(new java.awt.GridLayout(6, 2, 10, 10));

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
        jPanel1.add(txtPrezzo);

        lblCategoria.setText("Categoria");
        jPanel1.add(lblCategoria);

        cbxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Antipasti", "Primi", "Secondi", "Pizze", "Dessert", "Bevande" }));
        jPanel1.add(cbxCategoria);

        btnAnnulla.setText("Annulla");
        jPanel1.add(btnAnnulla);

        btnAggiungi.setText("Aggiungi");
        jPanel1.add(btnAggiungi);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAggiungi;
    private javax.swing.JButton btnAnnulla;
    private javax.swing.JComboBox<String> cbxCategoria;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAllergeni;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblDescrizione;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPrezzo;
    private javax.swing.JTextField txtAllergeni;
    private javax.swing.JTextField txtDescrizione;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPrezzo;
    // End of variables declaration//GEN-END:variables
}
