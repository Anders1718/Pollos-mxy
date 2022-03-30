/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beauty;
import java.awt.Image;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
/**
 *
 * @author User
 */
public class IngresoCantidadProductos extends javax.swing.JFrame {
    String user = "root";
    String clave = "";
    String url = "jdbc:mysql://localhost:3306/beauty";
    Connection con ;
    Statement stmt;
    ResultSet rs;
    
    /**
     * Creates new form Inicio
     */
    public IngresoCantidadProductos() {
        initComponents();
        this.setTitle("Ingreso cantidad - Beauty");
        this.setLocationRelativeTo(null);
        
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(IngresoCantidadProductos.class.getName()).log(Level.SEVERE, null, ex);
            }
        buscarProducto(jTextFieldBuscar.getText());

    }
    public Image getIconImage(){
       Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes1/icono.png"));
       return retValue;
    }

     
    void buscarProducto(String buscar){
        
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("NOMBRE");
        
        modelo.addColumn("PRECIO VENTA");
        modelo.addColumn("CANTIDAD");
        
        TablaDatos.setModel(modelo);

        
        
        String datos[] = new String [4];
         
        try {
            con = DriverManager.getConnection(url, user, clave);
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM productos WHERE nombre"
                    + " LIKE '%"+buscar+"%' OR id LIKE '%"+buscar+"%'");
            while(rs.next()){
                datos[0]= rs.getString(1);
                datos[1]= rs.getString(2);
                datos[2]= rs.getString(3);
                datos[3]= rs.getString(8);
                
               
                modelo.addRow(datos);
            }
            TablaDatos.setModel(modelo);
            
            TableColumn columna = TablaDatos.getColumn("ID");
            columna.setMaxWidth(48);
            columna.setMinWidth(48);
            
        } catch (SQLException ex) {
            Logger.getLogger(IngresoCantidadProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
    
    


    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneProducto = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        jButtonAtras = new javax.swing.JButton();
        jTextFieldBuscar = new javax.swing.JTextField();
        jLabelSeleccionar = new javax.swing.JLabel();
        jLabelCantidad = new javax.swing.JLabel();
        jLabelId = new javax.swing.JLabel();
        jLabelBuscarNombre1 = new javax.swing.JLabel();
        jLabelBuscarNombre2 = new javax.swing.JLabel();
        MostrarCodigo = new javax.swing.JLabel();
        jButtonListo = new javax.swing.JButton();
        jLabelMostrarNombre1 = new javax.swing.JLabel();
        jLabelMostrarNombre3 = new javax.swing.JLabel();
        jTextFieldCantidad = new javax.swing.JTextField();
        jButtonInicio = new javax.swing.JButton();
        jLabelLogo = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();
        jLabelSumas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        TablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDatosMouseClicked(evt);
            }
        });
        jScrollPaneProducto.setViewportView(TablaDatos);

        getContentPane().add(jScrollPaneProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 670, 240));

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
        getContentPane().add(jButtonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 90, 40));

        jTextFieldBuscar.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jTextFieldBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0)));
        jTextFieldBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuscarActionPerformed(evt);
            }
        });
        jTextFieldBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldBuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldBuscarKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 260, -1));

        jLabelSeleccionar.setBackground(new java.awt.Color(201, 116, 88));
        jLabelSeleccionar.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelSeleccionar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSeleccionar.setText("SELECCIONE EL PRODUCTO DE LA TABLA");
        jLabelSeleccionar.setOpaque(true);
        getContentPane().add(jLabelSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabelCantidad.setBackground(new java.awt.Color(201, 116, 88));
        jLabelCantidad.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelCantidad.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCantidad.setText("INGRESE LA CANTIDAD:");
        jLabelCantidad.setOpaque(true);
        getContentPane().add(jLabelCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 430, 290, 30));

        jLabelId.setBackground(new java.awt.Color(102, 255, 102));
        jLabelId.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelId.setOpaque(true);
        getContentPane().add(jLabelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 350, 190, 30));

        jLabelBuscarNombre1.setBackground(new java.awt.Color(201, 116, 88));
        jLabelBuscarNombre1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelBuscarNombre1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBuscarNombre1.setText("INGRESE EL NOMBRE DEL PRODUCTO:");
        jLabelBuscarNombre1.setOpaque(true);
        getContentPane().add(jLabelBuscarNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        jLabelBuscarNombre2.setBackground(new java.awt.Color(201, 116, 88));
        jLabelBuscarNombre2.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelBuscarNombre2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBuscarNombre2.setText("O EL ID:");
        jLabelBuscarNombre2.setOpaque(true);
        getContentPane().add(jLabelBuscarNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));

        MostrarCodigo.setBackground(new java.awt.Color(201, 116, 88));
        MostrarCodigo.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        MostrarCodigo.setForeground(new java.awt.Color(255, 255, 255));
        MostrarCodigo.setText("ID:");
        MostrarCodigo.setOpaque(true);
        getContentPane().add(MostrarCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 350, 40, 30));

        jButtonListo.setBackground(new java.awt.Color(201, 116, 88));
        jButtonListo.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonListo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonListo.setText("INGRESAR");
        jButtonListo.setContentAreaFilled(false);
        jButtonListo.setOpaque(true);
        jButtonListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonListo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 560, 210, 50));

        jLabelMostrarNombre1.setBackground(new java.awt.Color(102, 255, 102));
        jLabelMostrarNombre1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelMostrarNombre1.setOpaque(true);
        getContentPane().add(jLabelMostrarNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 270, 190, 30));

        jLabelMostrarNombre3.setBackground(new java.awt.Color(201, 116, 88));
        jLabelMostrarNombre3.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelMostrarNombre3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMostrarNombre3.setText("NOMBRE DEL PRODUCTO:");
        jLabelMostrarNombre3.setOpaque(true);
        getContentPane().add(jLabelMostrarNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 270, 310, 30));

        jTextFieldCantidad.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jTextFieldCantidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0)));
        jTextFieldCantidad.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jTextFieldCantidadMouseMoved(evt);
            }
        });
        jTextFieldCantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldCantidadMouseClicked(evt);
            }
        });
        jTextFieldCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldCantidadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCantidadKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 430, 200, -1));

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
        getContentPane().add(jButtonInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 30, -1, -1));

        jLabelLogo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Pollo/chicken.png"))); // NOI18N
        getContentPane().add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

        jLabelFondo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelFondo.setOpaque(true);
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 650));

        jLabelSumas.setText("jLabel1");
        getContentPane().add(jLabelSumas, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 560, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        Productos I = new Productos();
        I.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jTextFieldBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscarKeyTyped
        char c= evt.getKeyChar();
        if(Character.isLowerCase(c)){
            String cad=(""+c).toUpperCase();
            c= cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_jTextFieldBuscarKeyTyped

    private void jTextFieldBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuscarActionPerformed

    private void jTextFieldBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscarKeyReleased
        buscarProducto(jTextFieldBuscar.getText());
    }//GEN-LAST:event_jTextFieldBuscarKeyReleased

    private void TablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDatosMouseClicked

            int seleccionar = TablaDatos.rowAtPoint(evt.getPoint());
            jLabelMostrarNombre1.setText(String.valueOf(TablaDatos.getValueAt(seleccionar, 1)));
            jLabelId.setText(String.valueOf(TablaDatos.getValueAt(seleccionar, 0)));
            jLabelSumas.setText(String.valueOf(TablaDatos.getValueAt(seleccionar, 2)));

    }//GEN-LAST:event_TablaDatosMouseClicked
    
    private void jButtonListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListoActionPerformed
        
        if(jLabelMostrarNombre1.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Seleccione un producto de la lista");
        }

        else if(jTextFieldCantidad.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "No ingresó la cantidad");
        }else{
            String v1 = jLabelSumas.getText();
            String v2 = jTextFieldCantidad.getText();
            double Suma = Double.parseDouble(v2) + Double.parseDouble(v1);
            String SumaDatos = String.valueOf(Suma);
            jLabelSumas.setText(SumaDatos);
            double cantidad=0;
            
            try {
            con = DriverManager.getConnection(url, user, clave);
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM productos WHERE id = "+jLabelId.getText()+"");
            while(rs.next()){
                if(rs.getString(8).equals("")){
                   cantidad = 0; 
                }else{
                    cantidad = Double.parseDouble(rs.getString(8));
                }
                
            }
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(IngresoCantidadProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
           cantidad += Double.parseDouble(jTextFieldCantidad.getText());
            try {
                con = DriverManager.getConnection(url, user, clave);
                stmt = con.createStatement();
                stmt.executeUpdate("UPDATE productos SET cantidad = '"+cantidad+"' WHERE id = '"
                        +jLabelId.getText()+"'");
                
            } catch (SQLException ex) {
                Logger.getLogger(Registrar.class.getName()).log(Level.SEVERE, null, ex);
            }
            

            JOptionPane.showMessageDialog(null, "INGRESO EXITOSO");
            
            jTextFieldCantidad.setText("");
            jLabelId.setText("");
            jTextFieldBuscar.setText("");
            jLabelMostrarNombre1.setText("");
            jLabelSumas.setText("");
            buscarProducto(jTextFieldBuscar.getText());

        }
    }//GEN-LAST:event_jButtonListoActionPerformed

    private void jTextFieldCantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCantidadKeyReleased
    
    }//GEN-LAST:event_jTextFieldCantidadKeyReleased

    private void jTextFieldCantidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldCantidadMouseClicked
        
    }//GEN-LAST:event_jTextFieldCantidadMouseClicked

    private void jTextFieldCantidadMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldCantidadMouseMoved
        
    }//GEN-LAST:event_jTextFieldCantidadMouseMoved

    private void jTextFieldCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCantidadKeyTyped
        
    }//GEN-LAST:event_jTextFieldCantidadKeyTyped

    private void jButtonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicioActionPerformed
        Inicio2 I = new Inicio2();
        I.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonInicioActionPerformed
    
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
            java.util.logging.Logger.getLogger(IngresoCantidadProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresoCantidadProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresoCantidadProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresoCantidadProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new IngresoCantidadProductos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MostrarCodigo;
    public javax.swing.JTable TablaDatos;
    public javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonInicio;
    public javax.swing.JButton jButtonListo;
    private javax.swing.JLabel jLabelBuscarNombre1;
    private javax.swing.JLabel jLabelBuscarNombre2;
    private javax.swing.JLabel jLabelCantidad;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelMostrarNombre1;
    private javax.swing.JLabel jLabelMostrarNombre3;
    private javax.swing.JLabel jLabelSeleccionar;
    private javax.swing.JLabel jLabelSumas;
    private javax.swing.JScrollPane jScrollPaneProducto;
    public javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JTextField jTextFieldCantidad;
    // End of variables declaration//GEN-END:variables

    private class SumaCantidad {

        public SumaCantidad() {
        
        
        
        }
    }
}
