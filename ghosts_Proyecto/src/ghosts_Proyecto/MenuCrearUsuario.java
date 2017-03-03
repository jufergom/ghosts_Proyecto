
package ghosts_Proyecto;

import javax.swing.JOptionPane;

public class MenuCrearUsuario  extends javax.swing.JFrame{


    public MenuCrearUsuario(){
        initComponents();
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtf_usuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bt_crearJugador = new javax.swing.JButton();
        bt_atras = new javax.swing.JButton();
        psw_contra = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Nuevo Jugador");

        jLabel2.setText("Usuario");

        jLabel3.setText("Contraseña");

        bt_crearJugador.setText("Crear Jugador");
        bt_crearJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_crearJugadorActionPerformed(evt);
            }
        });

        bt_atras.setText("Atras");
        bt_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_atrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 67, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(98, 98, 98))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtf_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                    .addComponent(psw_contra))
                                .addGap(81, 81, 81))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bt_atras)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(bt_crearJugador)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(psw_contra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bt_crearJugador)
                .addGap(65, 65, 65)
                .addComponent(bt_atras)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void bt_crearJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_crearJugadorActionPerformed
        boolean comprobar = MainProyecto.comprobarUsuario(jtf_usuario.getText());//aca se llama al metodo comprobarUsuario y se almacena en la variable comprobar
        if(comprobar == true){//aca ya se evalua si el usuario esta o no esta.
            JOptionPane.showMessageDialog(null,"Jugador ya existente","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(comprobar == false){//aca se evalua si el usuario no esta entonces se hacen las siguientes instrucciones.
                MainProyecto.crearUsuario(jtf_usuario.getText(), psw_contra.getText());//se llama al metodo y se crea el usuario.
                JOptionPane.showMessageDialog(null,"Usuario creado","Excelente",JOptionPane.INFORMATION_MESSAGE);//hace que se vea la ventanita diciendo que se creo el nuevo usuario
                MainProyecto.m.setVisible(false);//aca se cierra esta ventana actual de crearPlayer
                MainProyecto.m.setVisible(true);//etso hace que se abra la ventana de Menu_inicio
       }
        //******estos 2 de aca abajo hacen que luego de ingresar los datos y luego que haya ingresado el nuevo usuario entonces borre lo escrito en los textfiel
       jtf_usuario.setText("");
       psw_contra.setText("");
    }//GEN-LAST:event_bt_crearJugadorActionPerformed

    private void bt_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_atrasActionPerformed

        MainProyecto.m.setVisible(true);//etso hace que se abra la ventana de Menu_inicio
        this.dispose();//aca se cierra esta ventana actual de crearPlayer
    }//GEN-LAST:event_bt_atrasActionPerformed

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
            java.util.logging.Logger.getLogger(MenuCrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCrearUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_atras;
    private javax.swing.JButton bt_crearJugador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jtf_usuario;
    private javax.swing.JPasswordField psw_contra;
    // End of variables declaration//GEN-END:variables
}
