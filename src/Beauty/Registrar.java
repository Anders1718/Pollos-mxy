/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Beauty;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
/**
 *
 * @author User
 */
public class Registrar extends javax.swing.JFrame {
    int total=0;
    String user = "root";
    String clave = "";
    String url = "jdbc:mysql://localhost:3306/beauty";
    Connection con;
    Statement stmt;
    ResultSet rs;
    String datos[] = new String [3]; 
    DefaultTableModel modelo = new DefaultTableModel();
   
    
    /**
     * Creates new form Inicio
     */
    public Registrar() {
        
        initComponents();
        this.setTitle("Registrar - Contabilidad");
        this.setLocationRelativeTo(null);
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Registrar.class.getName()).log(Level.SEVERE, null, ex);
            }
        buscarProducto("");
        
        

        
        
          
       
    }
    public Image getIconImage(){
       Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes1/icono.png"));
       return retValue;
    }
    void buscarProducto(String buscar){
        
        modelo.addColumn("ID");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("PRECIO DE VENTA");
        
        //TablaDatos.setModel(modelo);

        try {
            con = DriverManager.getConnection(url, user, clave);
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM productos WHERE nombre LIKE '%"+buscar+"%'");
            while(rs.next()){
                datos[0]= rs.getString(1);
                datos[1]= rs.getString(2);
                datos[2]= rs.getString(3);
               
                modelo.addRow(datos);
                
            }
            TablaDatos.setModel(modelo);
            TableColumn columna = TablaDatos.getColumn("ID");
            columna.setMinWidth(38);
                columna.setMaxWidth(38);
        } catch (SQLException ex) {
            Logger.getLogger(BuscarProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    void refrescarPagina(String refrescar){
     try {
            con = DriverManager.getConnection(url, user, clave);
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM productos WHERE nombre LIKE '%"+refrescar+"%'");
            while(rs.next()){
                datos[0]= rs.getString(1);
                datos[1]= rs.getString(2);
                datos[2]= rs.getString(3);
                
                
                modelo.addRow(datos);
            }
            TablaDatos.setModel(modelo);
            TableColumn columna = TablaDatos.getColumn("ID");
            columna.setMinWidth(38);
            columna.setMaxWidth(38);
        } catch (SQLException ex) {
            Logger.getLogger(BuscarProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldCodigo = new javax.swing.JTextField();
        jLabelPrecio4 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jLabelNombres = new javax.swing.JLabel();
        jButtonListo = new javax.swing.JButton();
        jButtonCancelar1 = new javax.swing.JButton();
        jLabelPrecio3 = new javax.swing.JLabel();
        jTextFieldVenta = new javax.swing.JTextField();
        jButtonAtras = new javax.swing.JButton();
        jButtonInicio = new javax.swing.JButton();
        jScrollPaneProducto = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        jLabelLogo = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();
        jLabelSumas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldCodigo.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jTextFieldCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0)));
        jTextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoActionPerformed(evt);
            }
        });
        jTextFieldCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCodigoKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 240, -1));

        jLabelPrecio4.setBackground(new java.awt.Color(201, 116, 88));
        jLabelPrecio4.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelPrecio4.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPrecio4.setText("C??DIGO:");
        jLabelPrecio4.setOpaque(true);
        getContentPane().add(jLabelPrecio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 120, -1));

        jTextNombre.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jTextNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0)));
        jTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreActionPerformed(evt);
            }
        });
        jTextNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextNombreKeyTyped(evt);
            }
        });
        getContentPane().add(jTextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 240, -1));

        jLabelNombres.setBackground(new java.awt.Color(201, 116, 88));
        jLabelNombres.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelNombres.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombres.setText("CARACTER:");
        jLabelNombres.setOpaque(true);
        getContentPane().add(jLabelNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 140, -1));

        jButtonListo.setBackground(new java.awt.Color(201, 116, 88));
        jButtonListo.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonListo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonListo.setText("REGISTRAR");
        jButtonListo.setContentAreaFilled(false);
        jButtonListo.setOpaque(true);
        jButtonListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonListo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 580, 230, 50));

        jButtonCancelar1.setBackground(new java.awt.Color(201, 116, 88));
        jButtonCancelar1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonCancelar1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/x cancelar.png"))); // NOI18N
        jButtonCancelar1.setText("CANCELAR");
        jButtonCancelar1.setBorderPainted(false);
        jButtonCancelar1.setContentAreaFilled(false);
        jButtonCancelar1.setDefaultCapable(false);
        jButtonCancelar1.setOpaque(true);
        jButtonCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelar1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 580, 230, 50));

        jLabelPrecio3.setBackground(new java.awt.Color(201, 116, 88));
        jLabelPrecio3.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelPrecio3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPrecio3.setText("PRECIO DE VENTA:");
        jLabelPrecio3.setOpaque(true);
        getContentPane().add(jLabelPrecio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 230, -1));

        jTextFieldVenta.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jTextFieldVenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0)));
        jTextFieldVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVentaActionPerformed(evt);
            }
        });
        jTextFieldVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldVentaKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 240, -1));

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
        getContentPane().add(jButtonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 90, 40));

        jButtonInicio.setBackground(new java.awt.Color(201, 116, 88));
        jButtonInicio.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonInicio.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/inicio.png"))); // NOI18N
        jButtonInicio.setBorderPainted(false);
        jButtonInicio.setContentAreaFilled(false);
        jButtonInicio.setOpaque(true);
        jButtonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInicioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 30, -1, -1));

        TablaDatos = new javax.swing.JTable(){
            public boolean isCellEditable(int riwIndex, int colIndex){
                return false;
            }
        };
        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TablaDatos.getTableHeader().setReorderingAllowed(false);
        jScrollPaneProducto.setViewportView(TablaDatos);

        getContentPane().add(jScrollPaneProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 650, 350));

        jLabelLogo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Pollo/chicken.png"))); // NOI18N
        getContentPane().add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, -110, -1, -1));

        jLabelFondo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelFondo.setOpaque(true);
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 1310, 650));

        jLabelSumas.setText("jLabel1");
        getContentPane().add(jLabelSumas, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
     
    
    
    private void jTextNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNombreKeyTyped
        char c= evt.getKeyChar();
        if(Character.isLowerCase(c)){
            String cad=(""+c).toUpperCase();
            c= cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_jTextNombreKeyTyped

    private void jButtonListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListoActionPerformed
        boolean sw2=false;
        if(jTextNombre.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "No ingres?? el nombre de producto");
            sw2=true;
        }
            
        else if(jTextFieldVenta.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "No ingres?? el precio de venta");
            sw2=true;
        }else if(jTextFieldCodigo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "No escaneo el c??digo");
            sw2=true;
        }
        
        boolean sw = false;
       for(int i = 0; i < modelo.getRowCount(); i ++){
           if( TablaDatos.getValueAt(i, 1).equals(jTextNombre.getText()) ){
                    sw = true ;
           } 
       }if(sw == true){
           JOptionPane.showMessageDialog(null, "El producto ya est?? registrado");
           jTextNombre.setText("");
           
           
           jTextFieldVenta.setText("");
       }
       else if(sw2==false){
            
            try {
                con = DriverManager.getConnection(url, user, clave);
                stmt = con.createStatement();
                stmt.executeUpdate("INSERT INTO productos VALUES('0', '"+jTextNombre.getText()+"',"
                        + "'"+jTextFieldVenta.getText()+"' , '0' , '0' , '0' , '0' , '', '', '"+jTextFieldCodigo.getText()+"' )");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "error");
                Logger.getLogger(Registrar.class.getName()).log(Level.SEVERE, null, ex);
            }

            JOptionPane.showMessageDialog(null, "Registro exitoso");
            modelo.setRowCount(0);
            
            
            jTextNombre.setText("");
            jTextFieldVenta.setText("");
            jLabelSumas.setText("");
            
            refrescarPagina("");
        }
    }//GEN-LAST:event_jButtonListoActionPerformed

    private void jButtonCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelar1ActionPerformed
        
        jTextNombre.setText("");
        
        jTextFieldVenta.setText("");
        
    }//GEN-LAST:event_jButtonCancelar1ActionPerformed

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreActionPerformed

    private void jTextFieldVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldVentaKeyTyped
        char n = evt.getKeyChar();
        if(n < '0' || n> '9') evt.consume();
    }//GEN-LAST:event_jTextFieldVentaKeyTyped

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        Productos I = new Productos();
        I.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jButtonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicioActionPerformed
        Inicio2 I = new Inicio2();
        I.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonInicioActionPerformed

    private void jTextFieldVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldVentaActionPerformed

    private void jTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoActionPerformed

    private void jTextFieldCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCodigoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoKeyTyped

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
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Registrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable TablaDatos;
    public javax.swing.JButton jButtonAtras;
    public javax.swing.JButton jButtonCancelar1;
    private javax.swing.JButton jButtonInicio;
    private javax.swing.JButton jButtonListo;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelNombres;
    private javax.swing.JLabel jLabelPrecio3;
    private javax.swing.JLabel jLabelPrecio4;
    private javax.swing.JLabel jLabelSumas;
    private javax.swing.JScrollPane jScrollPaneProducto;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldVenta;
    public javax.swing.JTextField jTextNombre;
    // End of variables declaration//GEN-END:variables
}
