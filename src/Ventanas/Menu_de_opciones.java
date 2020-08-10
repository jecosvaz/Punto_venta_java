/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;





public class Menu_de_opciones extends javax.swing.JFrame {

    Altaproducto PanelAltaProducto;
    AltaEmpleados PanelAltaEmpleados;
    AltaClientes PanelAltaClientes;
    Ventas PanelVentas;
 
    public Menu_de_opciones() {
        initComponents();
        
    //tamaño de la ventana jform
        setSize(755,620);
    //Definicion de los jpane con las caracteristicas que se vana mostrar en el jform
        //jpane ventas
        PanelVentas = new Ventas();
            PanelVentas.setBounds(0,141,614,460);
                add(PanelVentas);
        //jpane clientes
        PanelAltaClientes = new AltaClientes();
            PanelAltaClientes.setBounds(0,141,614,460);
                add(PanelAltaClientes);
                        PanelAltaClientes.setVisible(false);
        //jpane productos
        PanelAltaProducto = new Altaproducto();
            PanelAltaProducto.setBounds(0,141,614,460);
                add(PanelAltaProducto);
                        PanelAltaProducto.setVisible(false);
        //jpane empleados
        PanelAltaEmpleados = new AltaEmpleados();
            PanelAltaEmpleados.setBounds(0,141,614,460);
                add(PanelAltaEmpleados);
                        PanelAltaEmpleados.setVisible(false);
        
        
        
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
        Btn_Producto = new javax.swing.JButton();
        Btn_Cliente = new javax.swing.JButton();
        Btn_Venta = new javax.swing.JButton();
        Btn_Empleados = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setPreferredSize(new java.awt.Dimension(755, 620));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1059, 760));
        jPanel1.setPreferredSize(new java.awt.Dimension(755, 140));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_Producto.setBackground(new java.awt.Color(255, 255, 51));
        Btn_Producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Alta_Producto.png"))); // NOI18N
        Btn_Producto.setText("Alta producto");
        Btn_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ProductoActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 190, -1));

        Btn_Cliente.setBackground(new java.awt.Color(51, 102, 255));
        Btn_Cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Cliente.png"))); // NOI18N
        Btn_Cliente.setText("Alta_cliente");
        Btn_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ClienteActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 170, 60));

        Btn_Venta.setBackground(new java.awt.Color(237, 112, 82));
        Btn_Venta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Carrito 2.png"))); // NOI18N
        Btn_Venta.setText("Venta");
        Btn_Venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_VentaActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 160, -1));

        Btn_Empleados.setBackground(new java.awt.Color(0, 204, 51));
        Btn_Empleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Maletin.png"))); // NOI18N
        Btn_Empleados.setText("Alta usuario");
        Btn_Empleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EmpleadosActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Empleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 180, -1));

        jLabel1.setBackground(new java.awt.Color(237, 112, 82));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(237, 112, 82));
        jLabel1.setText("MENU DE OPCIONES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ProductoActionPerformed
        setSize(755,620);
        PanelVentas.setVisible(false);
        PanelAltaClientes.setVisible(false);
        PanelAltaProducto.setVisible(true);
        PanelAltaEmpleados.setVisible(false);
        
       
        
        
    }//GEN-LAST:event_Btn_ProductoActionPerformed

    private void Btn_EmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EmpleadosActionPerformed
       setSize(755,620);
       PanelVentas.setVisible(false);
        PanelAltaClientes.setVisible(false);
        PanelAltaProducto.setVisible(false);
        PanelAltaEmpleados.setVisible(true);
    }//GEN-LAST:event_Btn_EmpleadosActionPerformed

    private void Btn_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ClienteActionPerformed
        PanelVentas.setVisible(false);
        PanelAltaClientes.setVisible(true);
        PanelAltaProducto.setVisible(false);
        PanelAltaEmpleados.setVisible(false);
    }//GEN-LAST:event_Btn_ClienteActionPerformed

    private void Btn_VentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_VentaActionPerformed
        PanelVentas.setVisible(true);
        PanelAltaClientes.setVisible(false);
        PanelAltaProducto.setVisible(false);
        PanelAltaEmpleados.setVisible(false);
    }//GEN-LAST:event_Btn_VentaActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_de_opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_de_opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_de_opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_de_opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_de_opciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Cliente;
    private javax.swing.JButton Btn_Empleados;
    private javax.swing.JButton Btn_Producto;
    private javax.swing.JButton Btn_Venta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
