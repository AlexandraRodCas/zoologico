/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Atxy2k.CustomTextField.RestrictedTextField;
import DAO.IZoologicoDAO;
import DAO.Zoologico;
import DAO.ZoologicoDAO;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import validores.Validadores;

/**
 *
 * @author lv1822
 */
public class zoologicos extends javax.swing.JFrame {
    DefaultTableModel modelo;
    private Validadores validadores = new Validadores();
    public IZoologicoDAO zoologicoDAO = new ZoologicoDAO();
    

    /**
     * Creates new form zoologicos
     */
    public zoologicos() {
        initComponents();
        modelo = new DefaultTableModel();
        modelo.addColumn("id_zoologico");
        modelo.addColumn("nombre");
        modelo.addColumn("ciudad");
        modelo.addColumn("pais");
        modelo.addColumn("fecha_inauguracion");
        this.tblZoologico.setModel(modelo);
        RestrictedTextField tope = new RestrictedTextField(txtPais);
        tope.setLimit(10);
        tope.setOnlyNums(rootPaneCheckingEnabled);
        consultarTodos();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIdZoologico = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblZoologico = new javax.swing.JTable();
        txtCiudad = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtPais = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        btnCancelar2 = new javax.swing.JButton();
        btnBuscarPorId = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuOpcionesZoologicos = new javax.swing.JMenu();
        menuitemEspecies = new javax.swing.JMenuItem();
        menuitemAnimales = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Zoologicos");

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/Delete.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel1.setText("ID Zoologico:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Ciudad:");

        jLabel4.setText("País:");

        tblZoologico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblZoologico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblZoologicoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblZoologico);

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/Floppy.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel5.setText("Fecha");

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/folder_blue_parent.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnCancelar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/Sign_Delete_Icon_32.png"))); // NOI18N
        btnCancelar2.setText("Cancelar");
        btnCancelar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar2ActionPerformed(evt);
            }
        });

        btnBuscarPorId.setText("Buscar");
        btnBuscarPorId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPorIdActionPerformed(evt);
            }
        });

        menuOpcionesZoologicos.setText("Opciones");

        menuitemEspecies.setText("Especies");
        menuitemEspecies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemEspeciesActionPerformed(evt);
            }
        });
        menuOpcionesZoologicos.add(menuitemEspecies);

        menuitemAnimales.setText("Animales");
        menuitemAnimales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemAnimalesActionPerformed(evt);
            }
        });
        menuOpcionesZoologicos.add(menuitemAnimales);

        jMenuBar1.add(menuOpcionesZoologicos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCancelar2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtIdZoologico, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarPorId))
                    .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(55, 55, 55)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtIdZoologico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarPorId))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnGuardar)
                                .addComponent(btnCancelar2))
                            .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(23, 23, 23))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        if(txtIdZoologico.getText().length()<=0){
            String idS=JOptionPane.showInputDialog(null, "ID del animal que se va a eliminar");
            if(idS!=null){
                int idL=Integer.parseInt(idS);
                zoologicoDAO.eliminar(idL);
                consultarTodos();
            }
        }
        else{
            String idS=txtIdZoologico.getText();
            if(idS!=null){
                int idL=Integer.parseInt(idS);
                zoologicoDAO.eliminar(idL);
                limpiarTextbox();
                consultarTodos();
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tblZoologicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblZoologicoMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model= (DefaultTableModel) tblZoologico.getModel();
        String id_zoologico=model.getValueAt(tblZoologico.getSelectedRow(), 0).toString();
        String nombre=model.getValueAt(tblZoologico.getSelectedRow(), 1).toString();
        String ciudad=model.getValueAt(tblZoologico.getSelectedRow(), 2).toString();
        String pais=model.getValueAt(tblZoologico.getSelectedRow(), 3).toString();
        String fecha=model.getValueAt(tblZoologico.getSelectedRow(), 4).toString();
        txtIdZoologico.setText(id_zoologico);
        txtNombre.setText(nombre);
        txtCiudad.setText(ciudad);
        txtPais.setText(pais);
        Date fecha2 = new Date();
        String dia=fecha.substring(8,10);
        String mes=fecha.substring(5,7);
        String año=fecha.substring(0, 4);
        fecha2.setDate(Integer.parseInt(dia));
        fecha2.setMonth((Integer.parseInt(mes))-1);
        fecha2.setYear(Integer.parseInt(año)-1900);
        jDateChooser1.setDate(fecha2);

    }//GEN-LAST:event_tblZoologicoMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if(validacion()){
            if(validacionLargo()){
                Zoologico zoo= new Zoologico();
                if(validadores.validaEntero(txtIdZoologico.getText())){
                    zoo.setId_zoologico(Integer.parseInt(txtIdZoologico.getText()));
                }
                else{
                    JOptionPane.showMessageDialog(null, "ID debe ser un número", "Zoologico", JOptionPane.INFORMATION_MESSAGE);
                }
                zoo.setNombre(txtNombre.getText());
                zoo.setCiudad(txtCiudad.getText());
                zoo.setPais(txtPais.getText());
                Date fechaA = new Date();
                if(fechaA.equals(jDateChooser1.getDate())||fechaA.after(jDateChooser1.getDate())){
                    String fecha=(generaFecha(jDateChooser1.getDate().getDate(),jDateChooser1.getDate().getMonth(),jDateChooser1.getDate().getYear()));
                    zoo.setFecha_inauguracion(fecha);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Fecha invalida", "Zoologico", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
                if(zoologicoDAO.agregar(zoo)){
                    JOptionPane.showMessageDialog(null, "Se Agrego con Exito", "Zoologico", JOptionPane.INFORMATION_MESSAGE);
                    limpiarTextbox();
                }else{
                    JOptionPane.showMessageDialog(null, "Fallo al guardar el zoologico", "Zoologico", JOptionPane.INFORMATION_MESSAGE);
                }
                consultarTodos();
            }
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        if(validacion()){
            if(validacionLargo()){
                Zoologico zoo= new Zoologico();
                if(validadores.validaEntero(txtIdZoologico.getText())){
                    zoo.setId_zoologico(Integer.parseInt(txtIdZoologico.getText()));
                }
                else{
                    JOptionPane.showMessageDialog(null, "ID debe ser un número", "Zoologico", JOptionPane.INFORMATION_MESSAGE);
                }
                zoo.setNombre(txtNombre.getText());
                zoo.setCiudad(txtCiudad.getText());
                zoo.setPais(txtPais.getText());
                Date fechaA = new Date();
                if(fechaA.equals(jDateChooser1.getDate())||fechaA.after(jDateChooser1.getDate())){
                    String fecha=(generaFecha(jDateChooser1.getDate().getDate(),jDateChooser1.getDate().getMonth(),jDateChooser1.getDate().getYear()));
                    zoo.setFecha_inauguracion(fecha);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Fecha invalida", "Zoologico", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
                if(zoologicoDAO.actualizar(zoo)){
                   JOptionPane.showMessageDialog(null, "Se Actualizo con Exito", "Zoologico", JOptionPane.INFORMATION_MESSAGE);
                   limpiarTextbox();
                }else{
                   JOptionPane.showMessageDialog(null, "Fallo al actualizar el zoologico", "Zoologico", JOptionPane.INFORMATION_MESSAGE);
                }
                consultarTodos();
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void menuitemEspeciesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemEspeciesActionPerformed
        // TODO add your handling code here:
        especies ventanaE = new especies();
        ventanaE.setVisible(true);
        ventanaE.setLocationRelativeTo(null);
        this.dispose();
        
    }//GEN-LAST:event_menuitemEspeciesActionPerformed

    private void menuitemAnimalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemAnimalesActionPerformed
        // TODO add your handling code here:
        animales ventanaA=new animales();
        ventanaA.setVisible(true);
        ventanaA.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_menuitemAnimalesActionPerformed

    private void btnCancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar2ActionPerformed
        // TODO add your handling code here:
        limpiarTextbox();
        consultarTodos();
    }//GEN-LAST:event_btnCancelar2ActionPerformed

    private void btnBuscarPorIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPorIdActionPerformed
        
        String idS;
        if(txtIdZoologico.getText().length()<=0){
            idS=JOptionPane.showInputDialog(null, "ID del zoologico que se va a buscar");
            if (idS.length()<= 0) {
                JOptionPane.showMessageDialog(null, "El campo esta vacio", "Zoologico", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else{
            idS=txtIdZoologico.getText();
        }
        
        List<Zoologico> list = zoologicoDAO.consultar(Integer.parseInt(idS));
        DefaultTableModel model = (DefaultTableModel) tblZoologico.getModel();
        int rowCount = model.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        Object rowData[] = new Object[5];
        for (int i = 0; i < list.size(); i++) {
            rowData[0] = list.get(i).getId_zoologico();
            rowData[1] = list.get(i).getNombre();
            rowData[2] = list.get(i).getCiudad();
            rowData[3] = list.get(i).getPais();
            rowData[4] = list.get(i).getFecha_inauguracion();
            model.addRow(rowData);
        }
        JOptionPane.showMessageDialog(null, "Busqueda completada", "Zoologico", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnBuscarPorIdActionPerformed
 /**
 *
 * Metodo para consultar los zoologicos registrados
 */  
    public void consultarTodos() {
        List<Zoologico> list = zoologicoDAO.consultarTodos();
        DefaultTableModel model = (DefaultTableModel) tblZoologico.getModel();
        int rowCount = model.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        Object rowData[] = new Object[5];
        for (int i = 0; i < list.size(); i++) {
            rowData[0] = list.get(i).getId_zoologico();
            rowData[1] = list.get(i).getNombre();
            rowData[2] = list.get(i).getCiudad();
            rowData[3] = list.get(i).getPais();
            rowData[4] = list.get(i).getFecha_inauguracion();
            model.addRow(rowData);
        }
    }
     /**
 *
 * Metodo para dar formato a la fecha
 */  
    public String generaFecha(int dia, int mes, int año) {
        String diaS, mesS, añoS;
        mes=mes+1;
        if(dia<10){
            diaS="0"+dia;
            mesS="0"+mes;
        }
        else{
            diaS=dia+"";
            mesS=mes+"";
        }
        
        añoS=año+1900+"";
        return añoS+"-"+mesS+"-"+diaS;
    }
 /**
 *
 * Metodo para limpiar las cajas de texto
 */
    public void limpiarTextbox(){
        txtIdZoologico.setText("");
        txtNombre.setText("");
        txtCiudad.setText("");
        txtPais.setText("");
        Date fechaA = new Date();
        jDateChooser1.setDate(fechaA);
    }
/**
 *
 * Metodo para validar que esta vacio algún campo de texto
 */
    public boolean validacion(){
        if((txtIdZoologico.getText().length() == 0)||(txtNombre.getText().length() == 0)||(txtCiudad.getText().length() == 0)||
                (txtPais.getText().length() == 0)){
            JOptionPane.showMessageDialog(null, "Campos sin llenar", "Animal", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        else{
            return true;
        }
    }
    
/**
 *
 * Metodo para validar que el campo no esté muy largo
 */
    public boolean validacionLargo(){
        if((txtIdZoologico.getText().length() <= 11)||(txtNombre.getText().length() <= 100)||(txtCiudad.getText().length() <= 100)||
                (txtPais.getText().length() <= 100)){
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "Campos con infromacion muy larga", "Animal", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarPorId;
    private javax.swing.JButton btnCancelar2;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu menuOpcionesZoologicos;
    private javax.swing.JMenuItem menuitemAnimales;
    private javax.swing.JMenuItem menuitemEspecies;
    private javax.swing.JTable tblZoologico;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtIdZoologico;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPais;
    // End of variables declaration//GEN-END:variables
}
