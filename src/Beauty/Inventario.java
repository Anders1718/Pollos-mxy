/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beauty;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class Inventario extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inventario() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Inventario - Beauty");
        
        //setIconImage(new ImageIcon(getClass().getResource("imagenes1/LogoFamil.png")).getImage());
    }
    public Image getIconImage(){
       Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes1/icono.png"));
       return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonBuscar1 = new javax.swing.JButton();
        jButtonIngreso1 = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jButtonIngreso = new javax.swing.JButton();
        jButtonAtras = new javax.swing.JButton();
        jLabelLogo = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonBuscar1.setBackground(new java.awt.Color(201, 116, 88));
        jButtonBuscar1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonBuscar1.setForeground(new java.awt.Color(0, 0, 0));
        jButtonBuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Pollo/productos bien.png"))); // NOI18N
        jButtonBuscar1.setText("INGRESAR POLLOS");
        jButtonBuscar1.setBorderPainted(false);
        jButtonBuscar1.setContentAreaFilled(false);
        jButtonBuscar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonBuscar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscar1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 270, -1));

        jButtonIngreso1.setBackground(new java.awt.Color(201, 116, 88));
        jButtonIngreso1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonIngreso1.setForeground(new java.awt.Color(0, 0, 0));
        jButtonIngreso1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Pollo/pollo.png"))); // NOI18N
        jButtonIngreso1.setText("INGRESAR CANTIDAD");
        jButtonIngreso1.setBorder(null);
        jButtonIngreso1.setBorderPainted(false);
        jButtonIngreso1.setContentAreaFilled(false);
        jButtonIngreso1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonIngreso1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonIngreso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngreso1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIngreso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 360, 260, 250));

        jButtonBuscar.setBackground(new java.awt.Color(201, 116, 88));
        jButtonBuscar.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonBuscar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Pollo/muslo.png"))); // NOI18N
        jButtonBuscar.setText("EN BODEGA");
        jButtonBuscar.setBorderPainted(false);
        jButtonBuscar.setContentAreaFilled(false);
        jButtonBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 180, -1));

        jButtonIngreso.setBackground(new java.awt.Color(201, 116, 88));
        jButtonIngreso.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonIngreso.setForeground(new java.awt.Color(0, 0, 0));
        jButtonIngreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Pollo/inventario bien.png"))); // NOI18N
        jButtonIngreso.setText("REGISTRAR INSUMOS");
        jButtonIngreso.setBorder(null);
        jButtonIngreso.setBorderPainted(false);
        jButtonIngreso.setContentAreaFilled(false);
        jButtonIngreso.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonIngreso.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 80, 260, 250));

        jButtonAtras.setBackground(new java.awt.Color(201, 116, 88));
        jButtonAtras.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonAtras.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/atrasBlanco.png"))); // NOI18N
        jButtonAtras.setBorderPainted(false);
        jButtonAtras.setContentAreaFilled(false);
        jButtonAtras.setOpaque(true);
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 80, 40));

        jLabelLogo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Pollo/chicken.png"))); // NOI18N
        getContentPane().add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, -1));

        jLabelFondo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelFondo.setOpaque(true);
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 0, 1310, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        Bodega B = new Bodega();
        B.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresoActionPerformed
        Insumos In = new Insumos();
        In.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonIngresoActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        Inicio2 I = new Inicio2();
        I.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jButtonIngreso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngreso1ActionPerformed
        IngresoCantidadInsumos I = new IngresoCantidadInsumos();
        I.setVisible(true);
        dispose();    }//GEN-LAST:event_jButtonIngreso1ActionPerformed

    private void jButtonBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscar1ActionPerformed
        RegistrarPollos I = new RegistrarPollos();
        I.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonBuscar1ActionPerformed

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
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonBuscar1;
    private javax.swing.JButton jButtonIngreso;
    private javax.swing.JButton jButtonIngreso1;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelLogo;
    // End of variables declaration//GEN-END:variables
}
