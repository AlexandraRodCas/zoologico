/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import DAO.Especie;
import DAO.EspecieDAO;
import DAO.IEspecieDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import validores.Validadores;

/**
 *
 * @author lv1822
 */
public class especies extends javax.swing.JFrame {
    DefaultTableModel modelo;
    private Validadores validadores = new Validadores();
    public IEspecieDAO especieDAO=new EspecieDAO();

    /**
     * Creates new form especies
     */
    public especies() {
        initComponents();
        modelo = new DefaultTableModel();
        modelo.addColumn("IdEspecie");
        modelo.addColumn("Nombre vulgar");
        modelo.addColumn("Nombre cientifico");
        modelo.addColumn("Familia");
        modelo.addColumn("Peligro Extincion");
        this.tblEspecie.setModel(modelo);
        consultarTodos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblEspecie = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIdEspecie = new javax.swing.JTextField();
        txtNomCientifico = new javax.swing.JTextField();
        txtNomVulgar = new javax.swing.JTextField();
        txtFamilia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cajaPeligro = new javax.swing.JComboBox<>();
        btnBuscarPorId = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuOpcionesEspecies = new javax.swing.JMenu();
        menuItemZoologico = new javax.swing.JMenuItem();
        menuItemAnimales = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Especies");

        tblEspecie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblEspecie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEspecieMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblEspecie);

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/Sign_Delete_Icon_32.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/Floppy.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/folder_blue_parent.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/Delete.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel1.setText("ID Especie:");

        jLabel2.setText("Nombre vulgar:");

        jLabel3.setText("Nombre cientifico:");

        jLabel4.setText("Familia:");

        txtNomVulgar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomVulgarActionPerformed(evt);
            }
        });

        jLabel5.setText("Peligro en extinción:");

        cajaPeligro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----", "Si", "No" }));

        btnBuscarPorId.setText("Buscar");
        btnBuscarPorId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPorIdActionPerformed(evt);
            }
        });

        menuOpcionesEspecies.setText("Opciones");

        menuItemZoologico.setText("Zoologicos");
        menuItemZoologico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemZoologicoActionPerformed(evt);
            }
        });
        menuOpcionesEspecies.add(menuItemZoologico);

        menuItemAnimales.setText("Animales");
        menuItemAnimales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAnimalesActionPerformed(evt);
            }
        });
        menuOpcionesEspecies.add(menuItemAnimales);

        jMenuBar1.add(menuOpcionesEspecies);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomVulgar, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtFamilia)
                                .addComponent(txtNomCientifico, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtIdEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btnBuscarPorId))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cajaPeligro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarPorId))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomVulgar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNomCientifico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFamilia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cajaPeligro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblEspecieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEspecieMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model= (DefaultTableModel) tblEspecie.getModel();
        String idEspecie=model.getValueAt(tblEspecie.getSelectedRow(), 0).toString();
        String nomVulgar=model.getValueAt(tblEspecie.getSelectedRow(), 1).toString();
        String numCientifico=model.getValueAt(tblEspecie.getSelectedRow(), 2).toString();
        String familia=model.getValueAt(tblEspecie.getSelectedRow(), 3).toString();
        String peligro=model.getValueAt(tblEspecie.getSelectedRow(), 4).toString();
        txtIdEspecie.setText(idEspecie);
        txtNomVulgar.setText(nomVulgar);
        txtNomCientifico.setText(numCientifico);
        txtFamilia.setText(familia);
        if(peligro.equals("Si")){
            cajaPeligro.setSelectedIndex(1);
        }
        else{
            cajaPeligro.setSelectedIndex(2);
        }
    }//GEN-LAST:event_tblEspecieMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        limpiarTextbox();
        consultarTodos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if(validacion()){
            if(validacionLargo()){
                Especie especie= new Especie();
                if(validadores.validaEntero(txtIdEspecie.getText())){
                    especie.setId_especie(Integer.parseInt(txtIdEspecie.getText()));
                }
                else{
                    JOptionPane.showMessageDialog(null, "ID debe ser un número", "Especies", JOptionPane.INFORMATION_MESSAGE);
                }
                especie.setNombre_vulgar(txtNomVulgar.getText());
                especie.setNombre_cientifico(txtNomCientifico.getText());
                especie.setFamilia(txtFamilia.getText());
                if(cajaPeligro.getSelectedItem()=="Si"){
                    especie.setPeligo_extincion(1);
                }
                else{
                    especie.setPeligo_extincion(0);
                }
                if(especieDAO.agregar(especie)){
                   JOptionPane.showMessageDialog(null, "Se Agrego con Exito", "Especie", JOptionPane.INFORMATION_MESSAGE);
                   limpiarTextbox();
                }else{
                   JOptionPane.showMessageDialog(null, "Fallo al guardar la especie", "Especie", JOptionPane.INFORMATION_MESSAGE);
                }
                consultarTodos();
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        if(validacion()){
            if(validacionLargo()){
                Especie especie= new Especie();
                if(validadores.validaEntero(txtIdEspecie.getText())){
                    especie.setId_especie(Integer.parseInt(txtIdEspecie.getText()));
                }
                else{
                    JOptionPane.showMessageDialog(null, "ID debe ser un número", "Especies", JOptionPane.INFORMATION_MESSAGE);
                }
                System.out.println("");
                especie.setNombre_vulgar(txtNomVulgar.getText());
                especie.setNombre_cientifico(txtNomCientifico.getText());
                especie.setFamilia(txtFamilia.getText());
                if(cajaPeligro.getSelectedItem()=="Si"){
                    especie.setPeligo_extincion(1);
                }
                
                else{
                    especie.setPeligo_extincion(0);
                }
                if(especieDAO.actualizar(especie)){
                   JOptionPane.showMessageDialog(null, "Se Actualizo con Exito", "Especie", JOptionPane.INFORMATION_MESSAGE);
                   limpiarTextbox();
                }else{
                   JOptionPane.showMessageDialog(null, "Fallo al actualizar Especie", "Especie", JOptionPane.INFORMATION_MESSAGE);
                }
                consultarTodos();
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        if(txtIdEspecie.getText().length()<=0){
            String idS=JOptionPane.showInputDialog(null, "ID de la especie que se va a eliminar");
            if(idS!=null){
                int idL=Integer.parseInt(idS);
                especieDAO.eliminar(idL);
                consultarTodos();
            }
        }
        else{
            String idS=txtIdEspecie.getText();
            if(idS!=null){
                int idL=Integer.parseInt(idS);
                especieDAO.eliminar(idL);
                limpiarTextbox();
                consultarTodos();
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void menuItemAnimalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAnimalesActionPerformed
        // TODO add your handling code here:
        animales ventanaA=new animales();
        ventanaA.setVisible(true);
        ventanaA.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_menuItemAnimalesActionPerformed

    private void menuItemZoologicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemZoologicoActionPerformed
        // TODO add your handling code here:
        zoologicos ventanaZ=new zoologicos();
        ventanaZ.setVisible(true);
        ventanaZ.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_menuItemZoologicoActionPerformed

    private void txtNomVulgarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomVulgarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomVulgarActionPerformed

    private void btnBuscarPorIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPorIdActionPerformed
        String idS;
        if(txtIdEspecie.getText().length()<=0){
            idS=JOptionPane.showInputDialog(null, "ID de la especie que se va a buscar");
        }
        else{
            idS=txtIdEspecie.getText();
        }
        
        List<Especie> list=especieDAO.consultar(Integer.parseInt(idS));
        DefaultTableModel model= (DefaultTableModel) tblEspecie.getModel();
        int rowCount = model.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
          model.removeRow(i);
        }
        Object rowData[]=new Object[5];
        for(int i=0; i<list.size();i++){
            rowData[0]=list.get(i).getId_especie();
            rowData[1]=list.get(i).getNombre_vulgar();
            rowData[2]=list.get(i).getNombre_cientifico();
            rowData[3]=list.get(i).getFamilia();
            rowData[4]=list.get(i).getPeligo_extincion();
            if(rowData[4].equals(0)){
                rowData[4]="No";
            }
            else{
                rowData[4]="Si";
            }
            model.addRow(rowData);
        }
        JOptionPane.showMessageDialog(null, "Busqueda completada", "Especies", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnBuscarPorIdActionPerformed
/**
 *
 * Metodo para mostrar todas las especies registradas
 */
    public void consultarTodos(){
        List<Especie> list=especieDAO.consultarTodos();
        DefaultTableModel model= (DefaultTableModel) tblEspecie.getModel();
        int rowCount = model.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
          model.removeRow(i);
        }
        Object rowData[]=new Object[5];
        for(int i=0; i<list.size();i++){
            rowData[0]=list.get(i).getId_especie();
            rowData[1]=list.get(i).getNombre_vulgar();
            rowData[2]=list.get(i).getNombre_cientifico();
            rowData[3]=list.get(i).getFamilia();
            rowData[4]=list.get(i).getPeligo_extincion();
            if(rowData[4].equals(0)){
                rowData[4]="No";
            }
            else{
                rowData[4]="Si";
            }
            model.addRow(rowData);
        }
    }
/**
 *
 * Metodo para limpiar todos los campos de texto
 */
    public void limpiarTextbox(){
        txtIdEspecie.setText("");
        txtNomVulgar.setText("");
        txtNomCientifico.setText("");
        txtFamilia.setText("");
        cajaPeligro.setSelectedIndex(0);
    }

/**
 *
 * Metodo para validar que esta vacio algún campo de texto
 */
    public boolean validacion(){
        if((txtNomVulgar.getText().length()==0)||(txtNomCientifico.getText().length()==0)||
        (txtFamilia.getText().length()==0)||(cajaPeligro.getSelectedIndex() == 0)){
            JOptionPane.showMessageDialog(null, "Campos sin llenar", "Especie", JOptionPane.INFORMATION_MESSAGE);
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
        if((txtNomVulgar.getText().length()<=100)||!(txtNomCientifico.getText().length()<=100)||(txtFamilia.getText().length()<=100)){
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "Campos con infromacion muy larga", "Especie", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarPorId;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cajaPeligro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem menuItemAnimales;
    private javax.swing.JMenuItem menuItemZoologico;
    private javax.swing.JMenu menuOpcionesEspecies;
    private javax.swing.JTable tblEspecie;
    private javax.swing.JTextField txtFamilia;
    private javax.swing.JTextField txtIdEspecie;
    private javax.swing.JTextField txtNomCientifico;
    private javax.swing.JTextField txtNomVulgar;
    // End of variables declaration//GEN-END:variables
}