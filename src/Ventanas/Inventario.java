/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.Metodo;
import Clases.Medicamento;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author usuario
 */
public class Inventario extends javax.swing.JInternalFrame {

    Medicamento med = new Medicamento(); // Proporciona valores adecuados
    Metodo metodos = new Metodo();
    DefaultTableModel mdltabla;
    Vector vCabeceras = new Vector();
    public Inventario() {
        initComponents();
        
        vCabeceras.addElement("Codigo");
        vCabeceras.addElement("Nombre");
        vCabeceras.addElement("Cantidad");
        vCabeceras.addElement("Fecha. Cad");
        vCabeceras.addElement("Precio");

        mdltabla = new DefaultTableModel();  // Agrega esta línea para inicializar el modelo
        mdltabla.setColumnIdentifiers(vCabeceras);

        tbaregi.setModel(mdltabla);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombreMed = new javax.swing.JTextField();
        txtCadMedicamen = new javax.swing.JTextField();
        txtPreMedica = new javax.swing.JTextField();
        txtCodMedic = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbaregi = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        txtCatMEdic = new javax.swing.JTextField();

        setTitle("Inventario");
        getContentPane().setLayout(null);

        txtNombreMed.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));
        getContentPane().add(txtNombreMed);
        txtNombreMed.setBounds(30, 20, 130, 50);

        txtCadMedicamen.setBorder(javax.swing.BorderFactory.createTitledBorder("Caducidad"));
        getContentPane().add(txtCadMedicamen);
        txtCadMedicamen.setBounds(190, 20, 130, 50);

        txtPreMedica.setBorder(javax.swing.BorderFactory.createTitledBorder("Precio"));
        getContentPane().add(txtPreMedica);
        txtPreMedica.setBounds(190, 100, 130, 50);

        txtCodMedic.setBorder(javax.swing.BorderFactory.createTitledBorder("Codigo"));
        getContentPane().add(txtCodMedic);
        txtCodMedic.setBounds(350, 20, 130, 50);

        jButton1.setText("Eliminar");
        getContentPane().add(jButton1);
        jButton1.setBounds(310, 180, 120, 50);

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrar);
        btnMostrar.setBounds(180, 180, 120, 50);

        tbaregi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbaregi);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 250, 460, 230);

        btnAgregar.setText("Agregar ");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar);
        btnAgregar.setBounds(30, 180, 120, 50);

        txtCatMEdic.setBorder(javax.swing.BorderFactory.createTitledBorder("Cantidad"));
        getContentPane().add(txtCatMEdic);
        txtCatMEdic.setBounds(30, 100, 130, 50);

        setBounds(0, 0, 520, 531);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String codigo = txtCodMedic.getText();
        String nombre = txtNombreMed.getText();
        int cantidad = Integer.parseInt(txtCatMEdic.getText()); // Convierte el texto a entero

    // Configurar el objeto med
        med.setCodigo(codigo);
        med.setNombre(nombre);
        med.setDosis(cantidad);
        
        metodos.guardar(med);
        metodos.guardarArchivo(med);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        tbaregi.setModel(metodos.listaMedicamento());
    }//GEN-LAST:event_btnMostrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbaregi;
    private javax.swing.JTextField txtCadMedicamen;
    private javax.swing.JTextField txtCatMEdic;
    private javax.swing.JTextField txtCodMedic;
    private javax.swing.JTextField txtNombreMed;
    private javax.swing.JTextField txtPreMedica;
    // End of variables declaration//GEN-END:variables
}
