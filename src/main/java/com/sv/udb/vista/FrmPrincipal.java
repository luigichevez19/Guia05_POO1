/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.vista;

import com.sv.udb.controlador.EquipoCtrl;
import com.sv.udb.modelo.Equipos;
import com.sv.udb.recursos.Conexion;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        txtCodigo.enable(false);
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDescricion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEquipos = new javax.swing.JTable();
        btnSave = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ejercicio Conexion");

        lblCodigo.setText("Codigo:");

        lblNombre.setText("Nombre:");

        jLabel3.setText("Descripción:");

        tblEquipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Equipo", "Descripcion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEquipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEquiposMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEquipos);
        if (tblEquipos.getColumnModel().getColumnCount() > 0) {
            tblEquipos.getColumnModel().getColumn(1).setResizable(false);
        }

        btnSave.setText("Guardar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnActualizar.setText("Modificar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnDelete.setText("Eliminar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                .addComponent(txtDescricion))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblCodigo)
                                        .addComponent(lblNombre)
                                        .addComponent(jLabel3)
                                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnActualizar)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnLimpiar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblCodigo)
                .addGap(2, 2, 2)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescricion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnActualizar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRefresh)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLimpiar)
                .addContainerGap(89, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Equipos", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 763, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 355, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Jugadores", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
      if(!txtNombre.getText().trim().isEmpty() && !txtDescricion.getText().trim().isEmpty() && txtCodigo.getText().trim().isEmpty())
      {
     
        try 
        {
            Equipos obj = new Equipos();
            obj.setNombEqui(txtNombre.getText());
            obj.setDescEqui(txtDescricion.getText());
        if(new EquipoCtrl().guar(obj))
        {
        JOptionPane.showMessageDialog(this, "Guardado exitoso");
        Limpiar();
        }
        else
        {
         JOptionPane.showMessageDialog(this,"upps ocurrio un error");
        }
        }
        catch (Exception e) 
        {
             JOptionPane.showMessageDialog(this, e.getMessage());
        }
      }
       else
      {
          System.out.println("revise que este lleno");
      }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
      Refresh2();
    }//GEN-LAST:event_btnRefreshActionPerformed
    public void Refresh2 ()
    {
         try 
        {
      DefaultTableModel model = (DefaultTableModel)this.tblEquipos.getModel();
      while(model.getRowCount()>0){model.removeRow(0);}//Limpiando modelo
      for(Equipos temp: new EquipoCtrl().ver())
      {
      model.addRow(new Object[]{temp,temp.getDescEqui()} );
      }    
        } 
        catch (Exception e) 
        {
        JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    private void tblEquiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEquiposMouseClicked
    int fila = this.tblEquipos.getSelectedRow();
    if(fila >= 0)
    {
    Equipos obj = (Equipos) this.tblEquipos.getValueAt(fila,0);
    this.txtCodigo.setText(String.valueOf(obj.getCodiEqui()));
    this.txtNombre.setText(obj.getNombEqui());
    this.txtDescricion.setText(obj.getDescEqui());
    }
    }//GEN-LAST:event_tblEquiposMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
    if(!txtCodigo.getText().trim().isEmpty() && !txtNombre.getText().trim().isEmpty() 
    && !txtDescricion.getText().trim().isEmpty())
    {
        try 
        {
        Equipos obj = new Equipos();
        obj.setCodiEqui(Integer.parseInt(txtCodigo.getText()));
        obj.setNombEqui(txtNombre.getText());
        obj.setDescEqui(txtDescricion.getText());
        if(new EquipoCtrl().actu(obj))
        {
        JOptionPane.showMessageDialog(this,"Actualizado existoso");
        Refresh2();
        }
        else
        {
        JOptionPane.showMessageDialog(this,"Errors inesperado intente otra vez");
        }
        }
        catch (Exception e) 
        {
        
        }
    }
    else
    {
    JOptionPane.showMessageDialog(this, "Porfavor seleccione el elemento a modificar");
    }
    }//GEN-LAST:event_btnActualizarActionPerformed
public void Limpiar()
{
txtCodigo.setText("");
txtNombre.setText("");
txtDescricion.setText("");
txtNombre.requestFocus();
}
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
    if(!txtCodigo.getText().trim().isEmpty())
    {
        try 
        {
        Equipos obje = new Equipos();
        obje.setCodiEqui(Integer.parseInt(txtCodigo.getText()));
        if(new EquipoCtrl().eliminar(obje))
        {
        JOptionPane.showMessageDialog(this,"Elimanado Exitoso");
        Limpiar();
        Refresh2();
        }
        else
        {
        JOptionPane.showMessageDialog(this, "Ocurrio algo y no se puede elimianr");
        }
        } catch (Exception e) {
        }
    }
     else
    {
    JOptionPane.showMessageDialog(this, "Porfavor seleccione el elemento a eliminar");
    }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
    Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTable tblEquipos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescricion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
