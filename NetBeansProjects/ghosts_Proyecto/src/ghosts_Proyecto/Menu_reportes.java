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
public class Menu_reportes extends javax.swing.JFrame {

    /**
     * Creates new form Menu_reportes
     */
    public static int randomio(int max){
        int numAleatorio = (int) (Math.random() * max) +1;
        return numAleatorio;
    }
    public Menu_reportes() {
        initComponents();
        
        setLocationRelativeTo(null);//esto hace que la panatalla aparezca en medio
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
        jb_jugadores = new javax.swing.JButton();
        jb_ranking = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_pantalla = new javax.swing.JTextArea();
        jb_regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Reportes");

        jb_jugadores.setText("Ultimos Juegos");

        jb_ranking.setText("Ranking Jugadores");
        jb_ranking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_rankingActionPerformed(evt);
            }
        });

        ta_pantalla.setColumns(20);
        ta_pantalla.setRows(5);
        jScrollPane1.setViewportView(ta_pantalla);

        jb_regresar.setText("Regresar");
        jb_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jb_jugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jb_regresar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jb_ranking)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(156, 156, 156))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jb_jugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jb_ranking, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jb_regresar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_regresarActionPerformed
        Menu_principal mp =new Menu_principal();
        mp.setVisible(true);
        this.dispose();//aca se cierra esta ventana actual
    }//GEN-LAST:event_jb_regresarActionPerformed

    private void jb_rankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_rankingActionPerformed
       
        for (int i = 1; i <= 2; i++) {
            int v=0,d=0,em=0;
            
                
            int random2 = randomio(3);
                if (random2 == 1){
                v=10;        
                    
                }
                else if (random2 == 2){
                d=23;  
                }
                else if (random2 == 3){
                em=4;
                }
                ta_pantalla.append("   ***Ranking***   \n");
                
                ta_pantalla.append("   El jugador "+i+ " lleva   \n");
                ta_pantalla.append("|Victorias   |Derrotas   |Empates |\n");
                ta_pantalla.append("|    "+v+"           |   "+d+"              |"+em+"       |\n");
        }
    }//GEN-LAST:event_jb_rankingActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_reportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_jugadores;
    private javax.swing.JButton jb_ranking;
    private javax.swing.JButton jb_regresar;
    private javax.swing.JTextArea ta_pantalla;
    // End of variables declaration//GEN-END:variables
}