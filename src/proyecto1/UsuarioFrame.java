
package ipc.proyecto1;

import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class UsuarioFrame extends javax.swing.JFrame {

    public UsuarioFrame() {
        initComponents();

        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("USUARIO");

        llenarTablaTarjetas();
        llenarTablaFacturas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        NameTargetaTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        NumTargetaTextField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        SaveTargetaButton = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        NameCompletoTextField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        DirecciónTextField = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        NitTextField = new javax.swing.JTextField();
        CerrarButton = new javax.swing.JButton();
        DateVenChooser = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        cvvTextField = new javax.swing.JTextField();
        SaveFacturaButton = new javax.swing.JButton();
        PedidoButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TarjetaTable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        FacturaTable = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("USAC-DELIVERY");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("DATOS DE FACTURACIÓN");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("REGISTRO DE TARJETA");

        NameTargetaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTargetaTextFieldActionPerformed(evt);
            }
        });

        jLabel12.setText("NOMBRE DE LA TARJETA:");

        jLabel13.setText("NUMERO DE TARJETA:");

        jLabel14.setText("FECHA DE VENCIMIENTO:");

        SaveTargetaButton.setText("GUARDAR");
        SaveTargetaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveTargetaButtonActionPerformed(evt);
            }
        });

        jLabel17.setText("NOMBRE COMPLETO:");

        jLabel18.setText("DIRECCIÓN");

        jLabel19.setText("NIT");

        CerrarButton.setText("Regresar");
        CerrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarButtonActionPerformed(evt);
            }
        });

        jLabel16.setText("CVV:");

        SaveFacturaButton.setText("GUARDAR");
        SaveFacturaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveFacturaButtonActionPerformed(evt);
            }
        });

        PedidoButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PedidoButton.setText("REALIZAR PEDIDOS");
        PedidoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PedidoButtonActionPerformed(evt);
            }
        });

        TarjetaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Tarjeta", "Numero Tarjeta", "CVV", "Fecha de Vencimiento"
            }
        ));
        jScrollPane1.setViewportView(TarjetaTable);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("TARJETAS ");

        FacturaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Direccion", "NIT"
            }
        ));
        jScrollPane2.setViewportView(FacturaTable);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setText("DATOS DE FACTURACION");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel13)
                                    .addComponent(NumTargetaTextField)
                                    .addComponent(jLabel14)
                                    .addComponent(DateVenChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(SaveTargetaButton))
                                    .addComponent(cvvTextField)
                                    .addComponent(jLabel12)
                                    .addComponent(NameTargetaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SaveFacturaButton)
                                .addGap(96, 96, 96)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel3))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addComponent(jLabel9)
                                                .addGap(220, 220, 220)
                                                .addComponent(jLabel10))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel17)
                                                        .addComponent(jLabel18)
                                                        .addComponent(DirecciónTextField)
                                                        .addComponent(NitTextField)
                                                        .addComponent(NameCompletoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jLabel19))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(jLabel20)
                                                        .addGap(115, 115, 115))))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CerrarButton)))))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PedidoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CerrarButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel15)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(NameTargetaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(NumTargetaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel16)
                            .addGap(5, 5, 5)
                            .addComponent(cvvTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel14)
                            .addGap(13, 13, 13)
                            .addComponent(DateVenChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(SaveTargetaButton))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel17)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(NameCompletoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel18)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(DirecciónTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel19)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(NitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(SaveFacturaButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addComponent(PedidoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarButtonActionPerformed

        LoginFrame login = new LoginFrame();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_CerrarButtonActionPerformed

    private void PedidoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PedidoButtonActionPerformed
        PedidosFrame pedido = new PedidosFrame();
        pedido.setVisible(true);
        dispose();
    }//GEN-LAST:event_PedidoButtonActionPerformed

    private void SaveTargetaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveTargetaButtonActionPerformed
        if (!NameTargetaTextField.getText().equals("") && !NumTargetaTextField.getText().equals("") && !cvvTextField.getText().equals("") && DateVenChooser.getDate() != null) {
            String nameTarjeta = NameTargetaTextField.getText();
            String numTarjeta = NumTargetaTextField.getText();
            String cvv = cvvTextField.getText();
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            String date = formatoFecha.format(DateVenChooser.getDate());

            ContenedorTarjeta ct = new ContenedorTarjeta(nameTarjeta, numTarjeta, cvv, date);
            AppState.usuarioLogeado.agregarTarjeta(ct);

            UsuarioFrame usuario = new UsuarioFrame();
            usuario.setVisible(true);
            dispose();
            JOptionPane.showMessageDialog(null, "Tarjeta Registrada!", "Alerta", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Rellenar todos los datos!", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_SaveTargetaButtonActionPerformed

    private void SaveFacturaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveFacturaButtonActionPerformed
        if (!NameCompletoTextField.getText().equals("") && !DirecciónTextField.getText().equals("") && !NitTextField.getText().equals("")) {
            String nameCompleto = NameCompletoTextField.getText();
            String direccion = DirecciónTextField.getText();
            String nit = NitTextField.getText();

            ContenedorFactura cf = new ContenedorFactura(nameCompleto, direccion, nit);
            AppState.usuarioLogeado.agregarFactura(cf);
            
            UsuarioFrame usuario = new UsuarioFrame();
            usuario.setVisible(true);
            dispose();
            JOptionPane.showMessageDialog(null, "Tarjeta Registrada!", "Alerta", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Rellenar todos los datos!", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_SaveFacturaButtonActionPerformed

    private void NameTargetaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTargetaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTargetaTextFieldActionPerformed

    private void llenarTablaTarjetas() {
        for (ContenedorTarjeta ci : AppState.usuarioLogeado.tarjetas) {
            DefaultTableModel modeloDafault = new DefaultTableModel(new String[]{"Nombre Tarjeta", "Numero Tarjeta", "CVV", "Fecha de Vencimiento"}, AppState.usuarioLogeado.tarjetas.size());
            TarjetaTable.setModel(modeloDafault);
            TableModel modeloDatos = TarjetaTable.getModel();
            for (int i = 0; i < AppState.usuarioLogeado.tarjetas.size(); i++) {
                modeloDatos.setValueAt(AppState.usuarioLogeado.tarjetas.get(i).getNameTarjeta(), i, 0);
                modeloDatos.setValueAt(AppState.usuarioLogeado.tarjetas.get(i).getNumTarjeta(), i, 1);
                modeloDatos.setValueAt(AppState.usuarioLogeado.tarjetas.get(i).getCvv(), i, 2);
                modeloDatos.setValueAt(AppState.usuarioLogeado.tarjetas.get(i).getFecha(), i, 3);
            }
        }
    }
    
    private void llenarTablaFacturas(){
        for(ContenedorFactura cf : AppState.usuarioLogeado.facturas){
           DefaultTableModel modeloDafault = new DefaultTableModel(new String[]{"Nombre", "Direccion", "NIT"}, AppState.usuarioLogeado.facturas.size());
            FacturaTable.setModel(modeloDafault);
            TableModel modeloDatos = FacturaTable.getModel();
            for (int i = 0; i < AppState.usuarioLogeado.facturas.size(); i++) {
                modeloDatos.setValueAt(AppState.usuarioLogeado.facturas.get(i).getNameCompleto(), i, 0);
                modeloDatos.setValueAt(AppState.usuarioLogeado.facturas.get(i).getDireccion(), i, 1);
                modeloDatos.setValueAt(AppState.usuarioLogeado.facturas.get(i).getNit(), i, 2);
            } 
        }
    }

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
            java.util.logging.Logger.getLogger(UsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuarioFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CerrarButton;
    private com.toedter.calendar.JDateChooser DateVenChooser;
    private javax.swing.JTextField DirecciónTextField;
    private javax.swing.JTable FacturaTable;
    private javax.swing.JTextField NameCompletoTextField;
    private javax.swing.JTextField NameTargetaTextField;
    private javax.swing.JTextField NitTextField;
    private javax.swing.JTextField NumTargetaTextField;
    private javax.swing.JButton PedidoButton;
    private javax.swing.JButton SaveFacturaButton;
    private javax.swing.JButton SaveTargetaButton;
    private javax.swing.JTable TarjetaTable;
    private javax.swing.JTextField cvvTextField;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}