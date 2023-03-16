
package ipc.proyecto1;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class AdministradorFrame extends javax.swing.JFrame {

    public AdministradorFrame() {
        initComponents();

        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("ADMIN");

        for (int i = 0; i < Proyecto1.regiones.size(); i++) {
            Regiones code = Proyecto1.regiones.get(i);
            CodeComboBox.addItem(code.getCode());
            CodeRegionComboBox.addItem(code.getCode());
        }

        for (int i = 0; i < Proyecto1.departamentos.size(); i++) {
            Departamentos code = Proyecto1.departamentos.get(i);
            CodeMuniComboBox.addItem(code.getCodigoDep());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CodeKioscoTextField = new javax.swing.JTextField();
        NameKioscoTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        CodeRegionTextField = new javax.swing.JTextField();
        NameRegionTextField = new javax.swing.JTextField();
        PrecioEspecialTextField = new javax.swing.JTextField();
        PrecioEstandarTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        NameDepTextField = new javax.swing.JTextField();
        CodeDepTextField = new javax.swing.JTextField();
        SaveRegionButton = new javax.swing.JButton();
        SaveDepButton = new javax.swing.JButton();
        SaveKioscoButton = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        NameMuniTextField = new javax.swing.JTextField();
        SaveMuniButton = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        CerrarButton = new javax.swing.JButton();
        VerButton = new javax.swing.JButton();
        CodeComboBox = new javax.swing.JComboBox<>();
        VerUsuarioButton = new javax.swing.JButton();
        CodeMuniComboBox = new javax.swing.JComboBox<>();
        CodeRegionComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel2.setText("MANERJO DE KIOSCOS");

        jLabel4.setText("CÓDIGO DE KIOSCO");

        jLabel5.setText("NOMBRE DE KIOSCO");

        jLabel6.setText("CÓDIGO DE LA REGIÓN");

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel7.setText("MANEJO DE REGIONES");

        jLabel8.setText("CÓDIGO DE REGIÓN:");

        jLabel9.setText("NOMBRE DE REGIÓN:");

        jLabel10.setText("PRECIO ESTANDAR:");

        jLabel11.setText("PRECIO ESPECIAL:");

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel12.setText("MANEJO DE DEPARTAMENTOS");

        jLabel13.setText("CÓDIGO DE REGIÓN:");

        jLabel14.setText("CÓDIGO DE DEPARTAMENTO:");

        jLabel16.setText("NOMBRE DEL DEPARTAMENTO:");

        SaveRegionButton.setText("GUARDAR");
        SaveRegionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveRegionButtonActionPerformed(evt);
            }
        });

        SaveDepButton.setText("GUARDAR");
        SaveDepButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveDepButtonActionPerformed(evt);
            }
        });

        SaveKioscoButton.setText("GUARDAR");
        SaveKioscoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveKioscoButtonActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel18.setText("MANEJO DE MUNICIPIOS");

        jLabel19.setText("CÓDIGO DE DEPARTAMENTO:");

        jLabel20.setText("NOMBRE DEL MUNICIPIO:");

        SaveMuniButton.setText("GUARDAR");
        SaveMuniButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveMuniButtonActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel21.setText("REPORTES");

        jLabel24.setText("LISTA DE REGIONES CON MÁS ENVÍOS:");

        jLabel25.setText("NÚMERO TOTAL DE PAQUETES ENVIADOS:");

        jLabel26.setText("INGRESOS TOTALES:");

        jLabel27.setText("LISTA DE USUARIOS CON MÁS PAQUETES ENVIADOS:");

        jButton1.setText("Consultar");

        jButton2.setText("Consultar");

        jButton3.setText("Consultar");

        jButton4.setText("Consultar");

        CerrarButton.setText("Cerrar");
        CerrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarButtonActionPerformed(evt);
            }
        });

        VerButton.setText("Ver Datos Guardados");
        VerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerButtonActionPerformed(evt);
            }
        });

        CodeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodeComboBoxActionPerformed(evt);
            }
        });

        VerUsuarioButton.setText("Ver Datos de Usuarios");
        VerUsuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerUsuarioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(NameKioscoTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CodeKioscoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(CodeRegionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(SaveKioscoButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CodeRegionTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(NameRegionTextField)
                                    .addComponent(PrecioEstandarTextField)
                                    .addComponent(PrecioEspecialTextField)))
                            .addComponent(CerrarButton))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabel12))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CodeDepTextField)
                                    .addComponent(NameDepTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(CodeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(SaveDepButton)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CodeMuniComboBox, 0, 168, Short.MAX_VALUE)
                                    .addComponent(NameMuniTextField))
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(75, 75, 75))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addGap(119, 119, 119))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SaveMuniButton)
                        .addGap(142, 142, 142))))
            .addGroup(layout.createSequentialGroup()
                .addGap(342, 342, 342)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(VerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(VerUsuarioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel21)))
                .addGap(111, 111, 111))
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(SaveRegionButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CodeMuniComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(NameMuniTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(118, 118, 118)
                        .addComponent(VerButton)
                        .addGap(18, 18, 18)
                        .addComponent(VerUsuarioButton)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(SaveMuniButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(CodeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(50, 50, 50)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel14)
                                                .addComponent(CodeDepTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel16)
                                                .addComponent(NameDepTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CodeRegionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel9)
                                            .addComponent(NameRegionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(PrecioEstandarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel11)
                                        .addComponent(PrecioEspecialTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(SaveDepButton))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel24)
                                    .addComponent(jButton1))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel25)
                                    .addComponent(jButton4))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel26)
                                    .addComponent(jButton3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel27)
                                    .addComponent(jButton2))
                                .addGap(0, 35, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SaveRegionButton)
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(CodeKioscoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(NameKioscoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel6)
                                            .addComponent(CodeRegionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(15, 15, 15)
                                        .addComponent(SaveKioscoButton)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CerrarButton)
                                .addGap(21, 21, 21))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveRegionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveRegionButtonActionPerformed

        try {
            if (!CodeRegionTextField.getText().equals("") && !NameRegionTextField.getText().equals("") && !PrecioEstandarTextField.getText().equals("") && !PrecioEspecialTextField.getText().equals("")) {
                String codeRegion = CodeRegionTextField.getText();
                String nameRegion = NameRegionTextField.getText();

                Double precioEstandarDouble = Double.valueOf(PrecioEstandarTextField.getText());
                Double precioEspecialDouble = Double.valueOf(PrecioEspecialTextField.getText());

                Proyecto1.registrarRegiones(codeRegion, nameRegion, precioEstandarDouble, precioEspecialDouble);

                JOptionPane.showMessageDialog(null, "DATOS GUARDADOS", "ENHORABUENA", JOptionPane.INFORMATION_MESSAGE);

                CodeRegionTextField.setText("");
                NameRegionTextField.setText("");
                PrecioEstandarTextField.setText("");
                PrecioEspecialTextField.setText("");

                AdministradorFrame adminFrame = new AdministradorFrame();
                adminFrame.setVisible(true);
                dispose();

            } else {
                JOptionPane.showMessageDialog(null, "DEBES LLENAR TODOS LOS CAMPOS", "Alerta", JOptionPane.WARNING_MESSAGE);
            }

        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "VALOR ERRONEO", "Alerta", JOptionPane.WARNING_MESSAGE);
            PrecioEstandarTextField.setText("");
            PrecioEspecialTextField.setText("");
        }
    }//GEN-LAST:event_SaveRegionButtonActionPerformed

    private void VerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerButtonActionPerformed
        DatosRegistradosFrame ver = new DatosRegistradosFrame();
        ver.setVisible(true);
        dispose();
    }//GEN-LAST:event_VerButtonActionPerformed

    private void CerrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarButtonActionPerformed
        LoginFrame login = new LoginFrame();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_CerrarButtonActionPerformed

    private void CodeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodeComboBoxActionPerformed

    }//GEN-LAST:event_CodeComboBoxActionPerformed

    private void SaveDepButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveDepButtonActionPerformed

        try {
            if (!CodeDepTextField.getText().equals("") && !NameDepTextField.getText().equals("")) {
                String codeRegion = CodeComboBox.getSelectedItem().toString();
                String codeDep = CodeDepTextField.getText();
                String nameDep = NameDepTextField.getText();

                Proyecto1.registrarDepartemtos(codeRegion, codeDep, nameDep);
                JOptionPane.showMessageDialog(null, "DATOS GUARDADOS", "ENHORABUENA", JOptionPane.INFORMATION_MESSAGE);

                CodeDepTextField.setText("");
                NameDepTextField.setText("");
                AdministradorFrame adminFrame = new AdministradorFrame();
                adminFrame.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "DEBES LLENAR TODOS LOS CAMPOS", "Alerta", JOptionPane.WARNING_MESSAGE);
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "DEBES LLENAR TODOS LOS CAMPOS", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_SaveDepButtonActionPerformed

    private void SaveMuniButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveMuniButtonActionPerformed
        try {
            if (!NameMuniTextField.getText().equals("")) {
                String codeDep = CodeMuniComboBox.getSelectedItem().toString();
                String nameMuni = NameMuniTextField.getText();

                Proyecto1.registrarMunicipio(codeDep, nameMuni);
                JOptionPane.showMessageDialog(null, "DATOS GUARDADOS", "ENHORABUENA", JOptionPane.INFORMATION_MESSAGE);
                NameMuniTextField.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "DEBES LLENAR TODOS LOS CAMPOS", "Alerta", JOptionPane.WARNING_MESSAGE);
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "DEBES REGISTRAR PRIMERO UN DEPARTAMENTO", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_SaveMuniButtonActionPerformed

    private void SaveKioscoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveKioscoButtonActionPerformed
        try{
            if (!CodeKioscoTextField.getText().equals("") && !NameKioscoTextField.getText().equals("")) {

            String codeKiosco = CodeKioscoTextField.getText();
            String nameKiosco = NameKioscoTextField.getText();
            String codeRegion = CodeRegionComboBox.getSelectedItem().toString();

            Proyecto1.registrarKiosco(codeKiosco, nameKiosco, codeRegion);
            JOptionPane.showMessageDialog(null, "DATOS GUARDADOS", "ENHORABUENA", JOptionPane.INFORMATION_MESSAGE);
            CodeKioscoTextField.setText("");
            NameKioscoTextField.setText("");

        } else {
            JOptionPane.showMessageDialog(null, "DEBES LLENAR TODOS LOS CAMPOS", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
        }catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "DEBES REGISTRAR PRIMERO UNA REGION", "Alerta", JOptionPane.WARNING_MESSAGE);
        } 
    }//GEN-LAST:event_SaveKioscoButtonActionPerformed

    private void VerUsuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerUsuarioButtonActionPerformed
        VerUsuariosFrame ver = new VerUsuariosFrame();
        ver.setVisible(true);
        dispose();
    }//GEN-LAST:event_VerUsuarioButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AdministradorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministradorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministradorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministradorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministradorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CerrarButton;
    private javax.swing.JComboBox<String> CodeComboBox;
    private javax.swing.JTextField CodeDepTextField;
    private javax.swing.JTextField CodeKioscoTextField;
    private javax.swing.JComboBox<String> CodeMuniComboBox;
    private javax.swing.JComboBox<String> CodeRegionComboBox;
    private javax.swing.JTextField CodeRegionTextField;
    private javax.swing.JTextField NameDepTextField;
    private javax.swing.JTextField NameKioscoTextField;
    private javax.swing.JTextField NameMuniTextField;
    private javax.swing.JTextField NameRegionTextField;
    private javax.swing.JTextField PrecioEspecialTextField;
    private javax.swing.JTextField PrecioEstandarTextField;
    private javax.swing.JButton SaveDepButton;
    private javax.swing.JButton SaveKioscoButton;
    private javax.swing.JButton SaveMuniButton;
    private javax.swing.JButton SaveRegionButton;
    private javax.swing.JButton VerButton;
    private javax.swing.JButton VerUsuarioButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
