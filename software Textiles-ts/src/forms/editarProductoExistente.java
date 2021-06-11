package forms;

import clases.informacionProducto;
import clases.inventarioProducto;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author jossu
 */
public class editarProductoExistente extends javax.swing.JFrame {
    private inventarioProducto productoAgregar = new inventarioProducto();
    private consultaInventario rellenarTabla = new consultaInventario();
    private DefaultTableModel dm;
    
    public editarProductoExistente() {
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("Editar producto existente");
        this.setResizable(false);
        rellenarTabla.start();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buscar_field = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        id_field1 = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        nombre_field1 = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        desc_field1 = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        existencias_field1 = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        pc_field1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        pv_field1 = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        btt_inicio = new javax.swing.JButton();
        btt_inicio1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Editar producto existente");

        jSeparator1.setForeground(new java.awt.Color(41, 168, 73));

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

        jLabel14.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Id Producto: ");

        id_field1.setBackground(new java.awt.Color(255, 255, 255));
        id_field1.setForeground(new java.awt.Color(51, 51, 51));
        id_field1.setBorder(null);

        jSeparator10.setForeground(new java.awt.Color(41, 168, 73));

        jLabel16.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Nombre:");

        nombre_field1.setBackground(new java.awt.Color(255, 255, 255));
        nombre_field1.setForeground(new java.awt.Color(51, 51, 51));
        nombre_field1.setBorder(null);

        jSeparator11.setForeground(new java.awt.Color(41, 168, 73));

        jLabel17.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Descripcion:");

        desc_field1.setBackground(new java.awt.Color(255, 255, 255));
        desc_field1.setForeground(new java.awt.Color(51, 51, 51));
        desc_field1.setBorder(null);

        jSeparator12.setForeground(new java.awt.Color(41, 168, 73));

        jLabel18.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Existencias:");

        existencias_field1.setBackground(new java.awt.Color(255, 255, 255));
        existencias_field1.setForeground(new java.awt.Color(51, 51, 51));
        existencias_field1.setBorder(null);

        jSeparator13.setForeground(new java.awt.Color(41, 168, 73));

        pc_field1.setBackground(new java.awt.Color(255, 255, 255));
        pc_field1.setForeground(new java.awt.Color(51, 51, 51));
        pc_field1.setBorder(null);

        jLabel19.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Precio compra:");

        jSeparator14.setForeground(new java.awt.Color(41, 168, 73));

        jLabel20.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Precio venta:");

        pv_field1.setBackground(new java.awt.Color(255, 255, 255));
        pv_field1.setForeground(new java.awt.Color(51, 51, 51));
        pv_field1.setBorder(null);
        pv_field1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pv_field1ActionPerformed(evt);
            }
        });

        jSeparator15.setForeground(new java.awt.Color(41, 168, 73));

        btt_inicio.setBackground(new java.awt.Color(41, 168, 73));
        btt_inicio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btt_inicio.setForeground(new java.awt.Color(255, 255, 255));
        btt_inicio.setText("Modificar producto");
        btt_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_inicioActionPerformed(evt);
            }
        });

        btt_inicio1.setBackground(new java.awt.Color(41, 168, 73));
        btt_inicio1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btt_inicio1.setForeground(new java.awt.Color(255, 255, 255));
        btt_inicio1.setText("Cancelar");
        btt_inicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_inicio1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jSeparator11)
                                            .addComponent(nombre_field1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jSeparator10)
                                            .addComponent(id_field1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(existencias_field1, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                            .addComponent(jSeparator13)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jSeparator12)
                                            .addComponent(desc_field1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel19)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jSeparator14)
                                                .addComponent(pc_field1, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                            .addComponent(pv_field1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jSeparator15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btt_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btt_inicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(buscar_field)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscar_field, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14)
                                .addComponent(id_field1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel17)
                                .addComponent(desc_field1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(pc_field1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(nombre_field1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(existencias_field1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)
                            .addComponent(pv_field1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btt_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btt_inicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
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

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel tabla = (DefaultTableModel)jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
        id_field1.setText(tabla.getValueAt(selectedRow, 0).toString());
        nombre_field1.setText(tabla.getValueAt(selectedRow, 1).toString());
        desc_field1.setText(tabla.getValueAt(selectedRow, 2).toString());
        existencias_field1.setText(tabla.getValueAt(selectedRow, 3).toString());
        pc_field1.setText(tabla.getValueAt(selectedRow, 4).toString());
        pv_field1.setText(tabla.getValueAt(selectedRow, 5).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTable1KeyPressed

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

    private void pv_field1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pv_field1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pv_field1ActionPerformed

    private void btt_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_inicioActionPerformed
        productoAgregar.editarProductoExistente(id_field1.getText(), nombre_field1.getText(), desc_field1.getText(), 
                Integer.valueOf(existencias_field1.getText()), Double.valueOf(pc_field1.getText()), Double.valueOf(pv_field1.getText()));
        consultaInventario consulta2 = new consultaInventario();
        consulta2.start();
        vaciarEditar();
    }//GEN-LAST:event_btt_inicioActionPerformed

    private void btt_inicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_inicio1ActionPerformed
        vaciarEditar();
        inventarioMenu ventana = new inventarioMenu();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btt_inicio1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editarProductoExistente().setVisible(true);
            }
        });
    }
    
    private void filtro(String consulta, JTable jtableBuscar, int row){
        dm = (DefaultTableModel) jtableBuscar.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(dm);
        jtableBuscar.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(consulta,row));
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
    
    public void vaciarTabla(){
        DefaultTableModel Modelo = (DefaultTableModel) jTable1.getModel();
        String titulos[] = {"ID Producto","Nombre","Descripcion","Existencias","Precio Compras", "Precio Ventas"};
        Modelo = new DefaultTableModel(null,titulos);
        jTable1.setModel(Modelo);
    }
    
    public void vaciarEditar(){
        id_field1.setText("");
        nombre_field1.setText("");
        desc_field1.setText("");
        existencias_field1.setText("");
        pc_field1.setText("");
        pv_field1.setText("");
    }
    
    public class consultaInventario extends Thread {
        @Override
        public void run() {
            vaciarTabla();
            agregarDatosTabla();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btt_inicio;
    private javax.swing.JButton btt_inicio1;
    private javax.swing.JTextField buscar_field;
    private javax.swing.JTextField desc_field1;
    private javax.swing.JTextField existencias_field1;
    private javax.swing.JTextField id_field1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nombre_field1;
    private javax.swing.JTextField pc_field1;
    private javax.swing.JTextField pv_field1;
    // End of variables declaration//GEN-END:variables
}
