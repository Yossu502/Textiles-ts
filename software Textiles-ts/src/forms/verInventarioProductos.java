package forms;

import clases.informacionProducto;
import clases.inventarioProducto;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author jossu
 */
public class verInventarioProductos extends javax.swing.JFrame {
    private DefaultTableModel dm;
    private consultaInventario rellenarTabla = new consultaInventario();
    private inventarioProducto productoAgregar = new inventarioProducto();
    
    public verInventarioProductos() {
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("Inventario Principal Productos");
        this.setResizable(false);
        rellenarTabla.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buscar_field = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btt_inicio1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        buscar_field.setBackground(new java.awt.Color(255, 255, 255));
        buscar_field.setForeground(new java.awt.Color(204, 204, 204));
        buscar_field.setText("Buscar producto por nombre");
        buscar_field.setBorder(null);
        buscar_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                buscar_fieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                buscar_fieldFocusLost(evt);
            }
        });
        buscar_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscar_fieldKeyReleased(evt);
            }
        });

        jSeparator9.setForeground(new java.awt.Color(41, 168, 73));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Producto", "Nombre ", "Descripcion", "Existencias", "Precio Compra", "Precio Venta"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Inventario Principal");

        jSeparator1.setForeground(new java.awt.Color(41, 168, 73));

        btt_inicio1.setBackground(new java.awt.Color(41, 168, 73));
        btt_inicio1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btt_inicio1.setForeground(new java.awt.Color(255, 255, 255));
        btt_inicio1.setText("Regresar");
        btt_inicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_inicio1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 110, Short.MAX_VALUE)
                .addComponent(buscar_field, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
                            .addComponent(jSeparator9)
                            .addComponent(jSeparator1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(btt_inicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buscar_field, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btt_inicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscar_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_buscar_fieldFocusGained
        // TODO add your handling code here:
        buscar_field.setText("");
        buscar_field.setForeground(Color.black);
    }//GEN-LAST:event_buscar_fieldFocusGained

    private void buscar_fieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_buscar_fieldFocusLost
        // TODO add your handling code here:
        Color texto = new Color(204, 204, 204);
        buscar_field.setText("Buscar producto por nombre");
        buscar_field.setForeground(texto);
    }//GEN-LAST:event_buscar_fieldFocusLost

    private void buscar_fieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscar_fieldKeyReleased
        // TODO add your handling code here:
        filtro(buscar_field.getText(), jTable1,1);
    }//GEN-LAST:event_buscar_fieldKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1KeyPressed

    private void btt_inicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_inicio1ActionPerformed
        inventarioMenu ventana = new inventarioMenu();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btt_inicio1ActionPerformed

    public void vaciarTabla(){
        DefaultTableModel Modelo = (DefaultTableModel) jTable1.getModel();
        String titulos[] = {"ID Producto","Nombre","Descripcion","Existencias","Precio Compras", "Precio Ventas"};
        Modelo = new DefaultTableModel(null,titulos);
        jTable1.setModel(Modelo);
    }
    
     private void agregarDatosTabla(){
        String dts[] = new String[6];
        ArrayList<informacionProducto> datosObtenidos = new ArrayList<informacionProducto>();
        datosObtenidos = productoAgregar.verDatosProductosInventario();
        DefaultTableModel miModelo = (DefaultTableModel) jTable1.getModel();
        for (informacionProducto datosObtenido : datosObtenidos) {
            dts[0] = datosObtenido.getIdProducto();
            dts[1] = datosObtenido.getNombreProducto();
            dts[2] = datosObtenido.getDescripcionProducto();
            dts[3] = datosObtenido.getExistenciasProducto();
            dts[4] = datosObtenido.getPrecioCompraProducto();
            dts[5] = datosObtenido.getPrecioVentaProducto();
            miModelo.addRow(dts);
        }
        jTable1.setModel(miModelo);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new verInventarioProductos().setVisible(true);
            }
        });
    }
    
    private void filtro(String consulta, JTable jtableBuscar, int row){
        dm = (DefaultTableModel) jtableBuscar.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(dm);
        jtableBuscar.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(consulta,row));
    }
    
    public class consultaInventario extends Thread {
        @Override
        public void run() {
            vaciarTabla();
            agregarDatosTabla();
        }
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btt_inicio1;
    private javax.swing.JTextField buscar_field;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
