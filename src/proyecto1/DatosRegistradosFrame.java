
package ipc.proyecto1;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class DatosRegistradosFrame extends javax.swing.JFrame {

    public DatosRegistradosFrame() {
        initComponents();

        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Datos Registrados");
        
        
        llenarTablaRegiones();
        llenarTablaDepartamentos();
        llenarTablaMunicipio();
        llenarTablaKiosco();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CerrarButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        RegionesTabla = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        MunicipioTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        DepartamentosTable = new javax.swing.JTable();
        DeleteRegionButton = new javax.swing.JButton();
        DeleteDepButton = new javax.swing.JButton();
        DeleteMuniButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        KioscoTable = new javax.swing.JTable();
        DeleteKioscoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CerrarButton.setText("Regresar");
        CerrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarButtonActionPerformed(evt);
            }
        });

        RegionesTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Región", "Precio Estándar", "Precio Especial"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        RegionesTabla.setToolTipText("");
        RegionesTabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(RegionesTabla);
        if (RegionesTabla.getColumnModel().getColumnCount() > 0) {
            RegionesTabla.getColumnModel().getColumn(0).setPreferredWidth(40);
            RegionesTabla.getColumnModel().getColumn(1).setPreferredWidth(40);
            RegionesTabla.getColumnModel().getColumn(2).setPreferredWidth(40);
            RegionesTabla.getColumnModel().getColumn(3).setPreferredWidth(40);
        }

        MunicipioTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Departamento", "Municipio"
            }
        ));
        MunicipioTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(MunicipioTable);
        if (MunicipioTable.getColumnModel().getColumnCount() > 0) {
            MunicipioTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            MunicipioTable.getColumnModel().getColumn(1).setPreferredWidth(50);
        }

        DepartamentosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Región", "Código Departamento", "Departamento"
            }
        ));
        DepartamentosTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(DepartamentosTable);
        if (DepartamentosTable.getColumnModel().getColumnCount() > 0) {
            DepartamentosTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            DepartamentosTable.getColumnModel().getColumn(1).setPreferredWidth(50);
            DepartamentosTable.getColumnModel().getColumn(2).setPreferredWidth(50);
        }

        DeleteRegionButton.setText("Eliminar Región");
        DeleteRegionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteRegionButtonActionPerformed(evt);
            }
        });

        DeleteDepButton.setText("Eliminar Departamento");
        DeleteDepButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteDepButtonActionPerformed(evt);
            }
        });

        DeleteMuniButton.setText("Eliminar Municipio");
        DeleteMuniButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteMuniButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setText("REGIONES");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel2.setText("DEPARTAMENTOS");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel4.setText("MUNICIPIOS");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel5.setText("KIOSCOS");

        KioscoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Kiosco", "Kiosco", "Código Región"
            }
        ));
        KioscoTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(KioscoTable);
        if (KioscoTable.getColumnModel().getColumnCount() > 0) {
            KioscoTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            KioscoTable.getColumnModel().getColumn(1).setPreferredWidth(50);
            KioscoTable.getColumnModel().getColumn(2).setPreferredWidth(50);
        }

        DeleteKioscoButton.setText("Eliminar Kiosco");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CerrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DeleteDepButton)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addComponent(DeleteRegionButton))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4)
                                .addComponent(DeleteMuniButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(DeleteKioscoButton)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DeleteRegionButton)
                    .addComponent(DeleteMuniButton))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeleteDepButton)
                    .addComponent(DeleteKioscoButton))
                .addGap(52, 52, 52)
                .addComponent(CerrarButton)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarButtonActionPerformed
        AdministradorFrame admin = new AdministradorFrame();
        admin.setVisible(true);
        dispose();
    }//GEN-LAST:event_CerrarButtonActionPerformed

    private void DeleteRegionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteRegionButtonActionPerformed
        int eliminarFila = RegionesTabla.getSelectedRow();
        
        if (eliminarFila >=0){
            Proyecto1.regiones.remove(eliminarFila);
            llenarTablaRegiones();
        }
    }//GEN-LAST:event_DeleteRegionButtonActionPerformed

    private void DeleteDepButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteDepButtonActionPerformed
        int eliminarFila2 = DepartamentosTable.getSelectedRow();
        
        if(eliminarFila2 >= 0){
            Proyecto1.departamentos.remove(eliminarFila2);
            llenarTablaDepartamentos();
        }
    }//GEN-LAST:event_DeleteDepButtonActionPerformed

    private void DeleteMuniButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteMuniButtonActionPerformed
        int eliminarFila3 = MunicipioTable.getSelectedRow();
        
        if (eliminarFila3 >= 0){
            Proyecto1.municipios.remove(eliminarFila3);
            llenarTablaMunicipio();
        }
    }//GEN-LAST:event_DeleteMuniButtonActionPerformed

    
    private void llenarTablaRegiones(){
        
       DefaultTableModel modeloDafault = new DefaultTableModel(new String[]{"Codigo" , "Region" , "Precio Estandar" , "Pricio Especial"},Proyecto1.regiones.size());
       RegionesTabla.setModel(modeloDafault);
       
       TableModel modeloDatos = RegionesTabla.getModel();
       for(int i =0; i <Proyecto1.regiones.size(); i++){
           Regiones region = Proyecto1.regiones.get(i);
           modeloDatos.setValueAt(Proyecto1.regiones.get(i).getCode(),i,0);
           modeloDatos.setValueAt(Proyecto1.regiones.get(i).getName(),i,1);
           modeloDatos.setValueAt(Proyecto1.regiones.get(i).getEstandar(),i,2);
           modeloDatos.setValueAt(Proyecto1.regiones.get(i).getEspecial(),i,3);
       }
        
    }
    
    private void llenarTablaDepartamentos(){  
        DefaultTableModel modeloDafault = new DefaultTableModel(new String[]{"Codigo Region","Codigo Departamento","Departamento"},Proyecto1.departamentos.size());
        DepartamentosTable.setModel(modeloDafault);
        
        TableModel modeloDatos = DepartamentosTable.getModel();
        for(int i = 0; i < Proyecto1.departamentos.size(); i++){
            modeloDatos.setValueAt(Proyecto1.departamentos.get(i).getCodigoRegistro(),i,0);
            modeloDatos.setValueAt(Proyecto1.departamentos.get(i).getCodigoDep(),i,1);
            modeloDatos.setValueAt(Proyecto1.departamentos.get(i).getNameDep(),i,2);
        }
        
        
    }
    
    private void llenarTablaMunicipio(){
        DefaultTableModel modeloDafault = new DefaultTableModel(new String[]{"Codigo Departamento", "Municipio"}, Proyecto1.municipios.size());
        MunicipioTable.setModel(modeloDafault);
        
        TableModel modeloDatos = MunicipioTable.getModel();
        for(int i = 0; i < Proyecto1.municipios.size(); i++){
           modeloDatos.setValueAt(Proyecto1.municipios.get(i).getCodeDep(),i,0);
           modeloDatos.setValueAt(Proyecto1.municipios.get(i).getNameMunicipio(),i,1);
        }   
    }
    
    private void llenarTablaKiosco(){
       DefaultTableModel modeloDafault = new DefaultTableModel(new String[]{"Codigo Kiosco","Kiosco","Codigo Region"}, Proyecto1.kioscos.size()); 
       KioscoTable.setModel(modeloDafault);
       
       TableModel modeloDatos = KioscoTable.getModel();
       for(int i = 0; i < Proyecto1.kioscos.size(); i++){
           modeloDatos.setValueAt(Proyecto1.kioscos.get(i).getCodeKiosco(),i,0);
           modeloDatos.setValueAt(Proyecto1.kioscos.get(i).getNameKiosco(),i,1);
           modeloDatos.setValueAt(Proyecto1.kioscos.get(i).getCodeRegiones(),i,2);
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
            java.util.logging.Logger.getLogger(DatosRegistradosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatosRegistradosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatosRegistradosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatosRegistradosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatosRegistradosFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CerrarButton;
    private javax.swing.JButton DeleteDepButton;
    private javax.swing.JButton DeleteKioscoButton;
    private javax.swing.JButton DeleteMuniButton;
    private javax.swing.JButton DeleteRegionButton;
    private javax.swing.JTable DepartamentosTable;
    private javax.swing.JTable KioscoTable;
    private javax.swing.JTable MunicipioTable;
    private javax.swing.JTable RegionesTabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
