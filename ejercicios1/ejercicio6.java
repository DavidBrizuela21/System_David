/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios1;

import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author HP
 */
public class ejercicio6 extends javax.swing.JFrame {

    /**
     * Creates new form ejercicio6
     */
    public ejercicio6() {
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

        cboNumeros = new javax.swing.JComboBox<>();
        btnImpares = new javax.swing.JButton();
        btnPares = new javax.swing.JButton();
        etiResultado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cboNumeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNumerosActionPerformed(evt);
            }
        });

        btnImpares.setText("IMPAR");
        btnImpares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImparesActionPerformed(evt);
            }
        });

        btnPares.setText("PAR");
        btnPares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(etiResultado)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(cboNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnImpares)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPares)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImpares)
                    .addComponent(btnPares))
                .addGap(68, 68, 68)
                .addComponent(etiResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImparesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImparesActionPerformed
        int i;
 
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
 
        for (i=1;i<10;i+=2) {
            modelo.addElement("Nº "+i);
        }
 
        cboNumeros.setModel(modelo);
    }//GEN-LAST:event_btnImparesActionPerformed

    private void btnParesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParesActionPerformed
        int i;
 
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
 
        for (i=0;i<10;i+=2) {
            modelo.addElement("Nº "+i);
        }
 
        cboNumeros.setModel(modelo);

    }//GEN-LAST:event_btnParesActionPerformed

    private void cboNumerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNumerosActionPerformed
        etiResultado.setText(cboNumeros.getSelectedItem().toString());

    }//GEN-LAST:event_cboNumerosActionPerformed

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
            java.util.logging.Logger.getLogger(ejercicio6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ejercicio6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ejercicio6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ejercicio6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ejercicio6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImpares;
    private javax.swing.JButton btnPares;
    private javax.swing.JComboBox<String> cboNumeros;
    private javax.swing.JTextField etiResultado;
    // End of variables declaration//GEN-END:variables
}
