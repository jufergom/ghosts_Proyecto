/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ghosts_Proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author Jhair
 */
public class Player_2 extends javax.swing.JFrame {
    public static JuegoTablero nm;
    /**
     * Creates new form Player_2
     */
    public static Usuario usuarioActivo2;
    public Player_2() {
        initComponents();
        setLocationRelativeTo(null);
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
        tf_nom2 = new javax.swing.JTextField();
        jb_aceptar = new javax.swing.JButton();
        bt_2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Nombre Jugador 2");

        tf_nom2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nom2ActionPerformed(evt);
            }
        });

        jb_aceptar.setText("Aceptar");
        jb_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_aceptarActionPerformed(evt);
            }
        });

        bt_2.setText("Regresar");
        bt_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_nom2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jb_aceptar)
                        .addGap(28, 28, 28)
                        .addComponent(bt_2)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_nom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_aceptar)
                    .addComponent(bt_2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_nom2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nom2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nom2ActionPerformed


    private void jb_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_aceptarActionPerformed
         boolean comprobar = MainProyecto.comprobarUsuario(tf_nom2.getText());//aca se llama al metodo comprobarUsuario y se almacena en la variable comprobar
        if(comprobar == true){//aca ya se evalua si el usuario esta o no esta.
            for (int x = 0; x < 100; x++) {
                String a = MainProyecto.usuarios[x].getNombUsuario();
                if (a.equals(tf_nom2.getText())) {
                    usuarioActivo2 = MainProyecto.usuarios[x];
                }
            }
            nm = new JuegoTablero();
            this.dispose();
            nm.setVisible(true);
            if(JuegoTablero.modoJuego == "Aleatorio"){
                JOptionPane.showMessageDialog(null,"Los fantasmas de "+Menu_InicioSesion.UsuarioActivo.getNombUsuario()
                        + " son los blancos \ny los de "+Player_2.usuarioActivo2.getNombUsuario()+ " son los negros","Informacion",JOptionPane.INFORMATION_MESSAGE);
            }
        } 
        else{
            JOptionPane.showMessageDialog(null,"Ingrese un nombre de usuario valido","Error",JOptionPane.INFORMATION_MESSAGE);//hace que se vea la ventanita diciendo que se creo el nuevo usuario
        }
        
    }//GEN-LAST:event_jb_aceptarActionPerformed

    private void bt_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_2ActionPerformed
        Menu_principal mp = new Menu_principal();
        mp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bt_2ActionPerformed

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
            java.util.logging.Logger.getLogger(Player_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Player_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Player_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Player_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Player_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jb_aceptar;
    private javax.swing.JTextField tf_nom2;
    // End of variables declaration//GEN-END:variables
}
