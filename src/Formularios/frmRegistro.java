/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;


import Clases.ListaUsuarios;
import Clases.consultas;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class frmRegistro extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    private Map<String, String> usuarios = new HashMap<>();
    
    public frmRegistro() {
        initComponents();
        this.setLocationRelativeTo(this);
        
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
        jLabel6 = new javax.swing.JLabel();
        jtextContraseña = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jtextUsuario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(112, 145, 255));
        jPanel1.setLayout(null);

        jLabel6.setBackground(new java.awt.Color(112, 145, 255));
        jLabel6.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel6.setText("Nombre de usuario:");
        jLabel6.setToolTipText("");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(63, 81, 140, 26);

        jtextContraseña.setBackground(new java.awt.Color(112, 145, 255));
        jtextContraseña.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jtextContraseña.setForeground(new java.awt.Color(255, 255, 255));
        jtextContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtextContraseña.setBorder(null);
        jtextContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(jtextContraseña);
        jtextContraseña.setBounds(210, 140, 215, 26);

        jSeparator1.setBackground(new java.awt.Color(112, 145, 255));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(207, 113, 215, 12);

        jLabel7.setBackground(new java.awt.Color(112, 145, 255));
        jLabel7.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel7.setText("Contraseña:");
        jLabel7.setToolTipText("");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(115, 143, 88, 26);

        jSeparator2.setBackground(new java.awt.Color(112, 145, 255));
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(207, 175, 215, 12);

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrar");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(184, 16, 148, 30);

        btnRegresar.setBackground(new java.awt.Color(60, 78, 234));
        btnRegresar.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/previous.png"))); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar);
        btnRegresar.setBounds(86, 194, 117, 23);

        btnGuardar.setBackground(new java.awt.Color(60, 78, 234));
        btnGuardar.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar);
        btnGuardar.setBounds(280, 193, 89, 25);

        jtextUsuario.setBackground(new java.awt.Color(112, 145, 255));
        jtextUsuario.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jtextUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jtextUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtextUsuario.setBorder(null);
        jtextUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jtextUsuario);
        jtextUsuario.setBounds(207, 81, 215, 26);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(476, 309));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtextContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextContraseñaActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        frmInicio_Session f2=new frmInicio_Session();
        f2.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        String nombreUsuario = jtextUsuario.getText(); 
        String contrasena = jtextContraseña.getText();
        consultas obj = new consultas();
        if(consultas.verificarUsuarioNuevo(nombreUsuario)==-1){
            obj.setNombreUsuario(nombreUsuario);
            obj.setContrasena(contrasena);
            ListaUsuarios.agregar(obj);
            JOptionPane.showMessageDialog(this, "SE REGISTRÓ CORRECTAMENTE");
        }else{
            JOptionPane.showConfirmDialog(this, "Este Nombre está en uso");
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jtextUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(frmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jtextContraseña;
    private javax.swing.JTextField jtextUsuario;
    // End of variables declaration//GEN-END:variables
}
