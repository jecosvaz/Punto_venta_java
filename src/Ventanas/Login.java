/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

/**
 *
 * @author Jecosvaz
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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
        IconEn = new javax.swing.JLabel();
        jTextPass = new javax.swing.JTextField();
        jTextUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Btn_acceder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IconEn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_User_96px_2.png"))); // NOI18N
        jPanel1.add(IconEn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));
        jPanel1.add(jTextPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 250, 30));

        jTextUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jTextUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 250, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(237, 112, 82));
        jLabel1.setText("Contraseña");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(237, 112, 82));
        jLabel2.setText("Usuario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jLabel3.setBackground(new java.awt.Color(237, 112, 82));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(237, 112, 82));
        jLabel3.setText("Ingresa tu usuario y contraseña");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        Btn_acceder.setText("Acceder");
        Btn_acceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_accederActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_acceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextUsuarioActionPerformed

    private void Btn_accederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_accederActionPerformed
        String user,contraseña;
         user = jTextUsuario.getText();
        contraseña = jTextPass.getText();
        if (user.equals("1010") && contraseña.equals("12345")){ 
                Menu_de_opciones veropciones = new Menu_de_opciones();
                veropciones.setVisible(true);
                this.setVisible(false);  
        }
        //else{
        //if (user.equals("admin") && contraseña.equals("admin")){ 
                //Apertura_de_cuenta verapertura = new Apertura_de_cuenta();
                //verapertura.setVisible(true);
               //this.setVisible(false);
            //}else{
                  
            //JOptionPane.showMessageDialog(null, "El usuario o la contraseña son icorrectas\n Verifica tus Datos");
        
        //}   
        //}  
        
    }//GEN-LAST:event_Btn_accederActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_acceder;
    private javax.swing.JLabel IconEn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextPass;
    private javax.swing.JTextField jTextUsuario;
    // End of variables declaration//GEN-END:variables
}