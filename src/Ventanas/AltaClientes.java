/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ventanas;

/**
 *
 * @author Tecno
 */
public class AltaClientes extends javax.swing.JPanel {

    /** Creates new form Altaproducto */
    public AltaClientes() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        Bt_Save_Produc = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jT_Codigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jT_NameProduct = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jT_NameProduct1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jT_NameProduct2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jT_NameProduct3 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jT_NameProduct4 = new javax.swing.JTextField();
        Bt_Search = new javax.swing.JButton();
        Bt_Modificar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jT_Codigo1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabel10.setText("Codigo");

        setMaximumSize(new java.awt.Dimension(34, 14));
        setMinimumSize(new java.awt.Dimension(34, 14));
        setPreferredSize(new java.awt.Dimension(689, 460));
        setRequestFocusEnabled(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bt_Save_Produc.setText("Guardar");
        Bt_Save_Produc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_Save_ProducActionPerformed(evt);
            }
        });
        add(Bt_Save_Produc, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, 30));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 99, 71));
        jLabel1.setText("Buscar, eliminar, modificar.");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, -1));

        jT_Codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_CodigoActionPerformed(evt);
            }
        });
        add(jT_Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 270, 140, -1));

        jLabel3.setText("Nombre del Cliente");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, -1, -1));

        jT_NameProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_NameProductActionPerformed(evt);
            }
        });
        add(jT_NameProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 240, 30));

        jLabel4.setText("Direccion");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 70, -1));

        jT_NameProduct1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_NameProduct1ActionPerformed(evt);
            }
        });
        add(jT_NameProduct1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 220, -1));

        jLabel6.setText("Teléfono");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, -1));

        jT_NameProduct2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_NameProduct2ActionPerformed(evt);
            }
        });
        add(jT_NameProduct2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 100, -1));

        jLabel7.setText("Fecha de nacimiento");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, -1, -1));

        jT_NameProduct3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_NameProduct3ActionPerformed(evt);
            }
        });
        add(jT_NameProduct3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 150, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 690, 10));

        jLabel9.setText("Nombre Completo");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 150, -1));

        jT_NameProduct4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_NameProduct4ActionPerformed(evt);
            }
        });
        add(jT_NameProduct4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 250, -1));

        Bt_Search.setText("Buscar");
        Bt_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_SearchActionPerformed(evt);
            }
        });
        add(Bt_Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, -1, -1));

        Bt_Modificar.setText("Modificar");
        add(Bt_Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, -1, -1));

        jLabel11.setText("RFC");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jLabel12.setText("RFC");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 80, -1));

        jT_Codigo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_Codigo1ActionPerformed(evt);
            }
        });
        add(jT_Codigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 60, 130, -1));

        jLabel13.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 99, 71));
        jLabel13.setText("Registro de clientes");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "RFC", "Nombre Cliente", "Direccion", "Teléfono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 670, 90));

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void jT_CodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_CodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_CodigoActionPerformed

    private void jT_NameProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_NameProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_NameProductActionPerformed

    private void jT_NameProduct1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_NameProduct1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_NameProduct1ActionPerformed

    private void jT_NameProduct2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_NameProduct2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_NameProduct2ActionPerformed

    private void jT_NameProduct3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_NameProduct3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_NameProduct3ActionPerformed

    private void jT_NameProduct4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_NameProduct4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_NameProduct4ActionPerformed

    private void jT_Codigo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_Codigo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_Codigo1ActionPerformed

    private void Bt_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Bt_SearchActionPerformed

    private void Bt_Save_ProducActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_Save_ProducActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Bt_Save_ProducActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_Modificar;
    private javax.swing.JButton Bt_Save_Produc;
    private javax.swing.JButton Bt_Search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jT_Codigo;
    private javax.swing.JTextField jT_Codigo1;
    private javax.swing.JTextField jT_NameProduct;
    private javax.swing.JTextField jT_NameProduct1;
    private javax.swing.JTextField jT_NameProduct2;
    private javax.swing.JTextField jT_NameProduct3;
    private javax.swing.JTextField jT_NameProduct4;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
