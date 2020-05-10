package UNO.Ventana;
import UNO.Geometrica;
import javax.swing.JOptionPane;


/**
 *
 * @author AA
 */
public class VentanaUNO extends javax.swing.JFrame {

    Geometrica fG = new Geometrica();

    public VentanaUNO() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBASEFIGURA = new javax.swing.JLabel();
        txtBaseFG = new javax.swing.JTextField();
        lblALTURAFIGURA = new javax.swing.JLabel();
        txtAlturaFG = new javax.swing.JTextField();
        btnRealizarCalculo = new javax.swing.JButton();
        txtAreaFINAL = new javax.swing.JTextField();
        lblAREA = new javax.swing.JLabel();
        txtPerimetro = new javax.swing.JTextField();
        lblPERIMETRO = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Área y Perímetro");

        lblBASEFIGURA.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        lblBASEFIGURA.setText("Base de la figura geométrica:");

        txtBaseFG.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        txtBaseFG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBaseFGActionPerformed(evt);
            }
        });
        txtBaseFG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBaseFGKeyTyped(evt);
            }
        });

        lblALTURAFIGURA.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        lblALTURAFIGURA.setText("Altura de la figura geométrica:");

        txtAlturaFG.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        txtAlturaFG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlturaFGActionPerformed(evt);
            }
        });
        txtAlturaFG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAlturaFGKeyTyped(evt);
            }
        });

        btnRealizarCalculo.setBackground(new java.awt.Color(0, 0, 0));
        btnRealizarCalculo.setFont(new java.awt.Font("Microsoft JhengHei UI", 3, 24)); // NOI18N
        btnRealizarCalculo.setForeground(new java.awt.Color(0, 255, 204));
        btnRealizarCalculo.setText("REALIZAR CALCULO");
        btnRealizarCalculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarCalculoActionPerformed(evt);
            }
        });

        txtAreaFINAL.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N

        lblAREA.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        lblAREA.setText(": Área");

        txtPerimetro.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N

        lblPERIMETRO.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        lblPERIMETRO.setText(": Perímetro");

        btnSalir.setBackground(new java.awt.Color(0, 0, 0));
        btnSalir.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 0, 0));
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRealizarCalculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBASEFIGURA)
                            .addComponent(lblALTURAFIGURA))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAlturaFG, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                            .addComponent(txtBaseFG)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPerimetro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                            .addComponent(txtAreaFINAL, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPERIMETRO)
                            .addComponent(lblAREA)))
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblBASEFIGURA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBaseFG))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblALTURAFIGURA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAlturaFG))
                .addGap(18, 18, 18)
                .addComponent(btnRealizarCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAreaFINAL, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAREA))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPERIMETRO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRealizarCalculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarCalculoActionPerformed
        fG._area = fG.CalcularArea(Double.parseDouble(this.txtBaseFG.getText()), Double.parseDouble(txtAlturaFG.getText()));
        fG._perimeter = fG.CalcularPeri(Double.parseDouble(txtAlturaFG.getText()), Double.parseDouble(this.txtBaseFG.getText()));
        this.txtAreaFINAL.setText(Double.toString(this.fG._area));
        this.txtPerimetro.setText(Double.toString(this.fG._perimeter));
        this.txtBaseFG.setText("");
        this.txtAlturaFG.setText("");

    }//GEN-LAST:event_btnRealizarCalculoActionPerformed

    private void txtBaseFGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBaseFGActionPerformed

    }//GEN-LAST:event_txtBaseFGActionPerformed

    private void txtBaseFGKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBaseFGKeyTyped
        char validate = evt.getKeyChar();
        if (Character.isLetter(validate)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Tipo de dato NO VÁLIDO", "Validación: Error", 1);
        }
    }//GEN-LAST:event_txtBaseFGKeyTyped

    private void txtAlturaFGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlturaFGActionPerformed

    }//GEN-LAST:event_txtAlturaFGActionPerformed

    private void txtAlturaFGKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAlturaFGKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Tipo de dato NO VÁLIDO", "Validación: Error", 1);
        }
    }//GEN-LAST:event_txtAlturaFGKeyTyped

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaUNO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaUNO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaUNO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaUNO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaUNO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRealizarCalculo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblALTURAFIGURA;
    private javax.swing.JLabel lblAREA;
    private javax.swing.JLabel lblBASEFIGURA;
    private javax.swing.JLabel lblPERIMETRO;
    private javax.swing.JTextField txtAlturaFG;
    private javax.swing.JTextField txtAreaFINAL;
    private javax.swing.JTextField txtBaseFG;
    private javax.swing.JTextField txtPerimetro;
    // End of variables declaration//GEN-END:variables
}
