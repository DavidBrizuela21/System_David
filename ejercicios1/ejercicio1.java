/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios1;

/**
 *
 * @author utic
 */
public class ejercicio1 extends javax.swing.JDialog {

    /**
     * Creates new form ejercicio_1
     */
    public ejercicio1() {
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

        jLabel1 = new javax.swing.JLabel();
        chkPYTHON = new javax.swing.JCheckBox();
        chkJAVASCRIPT = new javax.swing.JCheckBox();
        chkJAVA = new javax.swing.JCheckBox();
        chkCSHARP = new javax.swing.JCheckBox();
        btn_aceptar = new javax.swing.JButton();
        panelTexto = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ejercicio5");
        setModal(true);

        jLabel1.setBackground(new java.awt.Color(146, 146, 146));
        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LENGUAJES DE PROGRAMACION");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        chkPYTHON.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        chkPYTHON.setText("PYTHON");
        chkPYTHON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPYTHONActionPerformed(evt);
            }
        });

        chkJAVASCRIPT.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        chkJAVASCRIPT.setText("JAVASCRIPT");

        chkJAVA.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        chkJAVA.setText("JAVA");

        chkCSHARP.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        chkCSHARP.setText("C#");

        btn_aceptar.setText("ACEPTAR");
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkCSHARP)
                    .addComponent(chkJAVA)
                    .addComponent(chkJAVASCRIPT)
                    .addComponent(chkPYTHON)
                    .addComponent(jLabel1)
                    .addComponent(btn_aceptar))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(chkPYTHON)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkJAVASCRIPT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkJAVA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkCSHARP)
                .addGap(18, 18, 18)
                .addComponent(btn_aceptar)
                .addGap(26, 26, 26)
                .addComponent(panelTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkPYTHONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPYTHONActionPerformed

    }//GEN-LAST:event_chkPYTHONActionPerformed

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        String mensaje = "Lenguaje seleccionado: ";
            if (chkPYTHON.isSelected()){
                mensaje = mensaje + "PYTHON ";
            }else if (chkJAVASCRIPT.isSelected()){
                mensaje = mensaje + "JAVASCRIPT ";
            }else if (chkJAVA.isSelected()){
                mensaje = mensaje + "JAVA ";
            }else if (chkCSHARP.isSelected()){
                mensaje = mensaje + "C# ";
            }else{
                mensaje = mensaje + "Ninguno";
            }
        panelTexto.setText(mensaje);
    }//GEN-LAST:event_btn_aceptarActionPerformed

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
            java.util.logging.Logger.getLogger(ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ejercicio1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JCheckBox chkCSHARP;
    private javax.swing.JCheckBox chkJAVA;
    private javax.swing.JCheckBox chkJAVASCRIPT;
    private javax.swing.JCheckBox chkPYTHON;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextPane panelTexto;
    // End of variables declaration//GEN-END:variables
}