/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ghosts_Proyecto;

/**
 *
 * @author Jhair
 */
public class Mi_perfil extends javax.swing.JFrame {

    /** Creates new form Mi_perfil */
    public Mi_perfil() {
        initComponents();
        setLocationRelativeTo(null);//esto hace que la panatalla aparezca en medio
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jb_miperfil = new javax.swing.JButton();
        jb_passwordc = new javax.swing.JButton();
        jb_eliminar = new javax.swing.JButton();
        jb_reg = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_Pantalla = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Perfil del Jugador");

        jb_miperfil.setText("Mis datos");
        jb_miperfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_miperfilActionPerformed(evt);
            }
        });

        jb_passwordc.setText("Cambiar password");
        jb_passwordc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_passwordcActionPerformed(evt);
            }
        });

        jb_eliminar.setText("Eliminar cuenta");

        jb_reg.setText("Regresar");
        jb_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_regActionPerformed(evt);
            }
        });

        ta_Pantalla.setEditable(false);
        ta_Pantalla.setColumns(20);
        ta_Pantalla.setRows(5);
        jScrollPane1.setViewportView(ta_Pantalla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(151, 151, 151))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jb_passwordc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jb_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jb_miperfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jb_reg)
                        .addGap(40, 40, 40)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jb_miperfil)
                        .addGap(18, 18, 18)
                        .addComponent(jb_passwordc)
                        .addGap(18, 18, 18)
                        .addComponent(jb_eliminar)
                        .addGap(18, 18, 18)
                        .addComponent(jb_reg))
                    .addComponent(jScrollPane1))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_regActionPerformed
        Menu_principal mp=new Menu_principal();
        mp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jb_regActionPerformed

    private void jb_passwordcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_passwordcActionPerformed
        cambio_p ns = new cambio_p();
        ns.setVisible(true);
        ns.setLocationRelativeTo(null);
    }//GEN-LAST:event_jb_passwordcActionPerformed

    private void jb_miperfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_miperfilActionPerformed

        
        ta_Pantalla.append("Nombre de Usuariol: \n"+Menu_InicioSesion.UsuarioActivo + "\n");
        
        ta_Pantalla.append("Contraseña: \n"+Menu_InicioSesion.UsuarioActivo.getContra()
        );
    }//GEN-LAST:event_jb_miperfilActionPerformed

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
            java.util.logging.Logger.getLogger(Mi_perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mi_perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mi_perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mi_perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mi_perfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_eliminar;
    private javax.swing.JButton jb_miperfil;
    private javax.swing.JButton jb_passwordc;
    private javax.swing.JButton jb_reg;
    private javax.swing.JTextArea ta_Pantalla;
    // End of variables declaration//GEN-END:variables

}
