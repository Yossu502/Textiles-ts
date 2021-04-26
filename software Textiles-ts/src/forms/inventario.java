
package forms;

import clases.ConexionDB;
import java.awt.Color;
import java.awt.Component;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;

public class inventario extends javax.swing.JFrame {
    consultaInventario consulta = new consultaInventario();
    String id, nombre, descripcion;
    int existencias;
    double precioC, precioV;
    DefaultTableModel dm;
    
    public inventario() {
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("Menu Inventario");
        this.setResizable(false);
        consulta.start();
        buscar_field.requestFocusInWindow();;
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        verProductos = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btt_inventario = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        btt_inventario1 = new javax.swing.JButton();
        buscar_field = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
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
        jLabel19 = new javax.swing.JLabel();
        pc_field1 = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        pv_field1 = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        nuevoProducto = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        id_field = new javax.swing.JTextField();
        nombre_field = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        desc_field = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        existencias_field = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        pc_field = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        pv_field = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        btt_regresar = new javax.swing.JButton();
        btt_add = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.CardLayout());

        verProductos.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Agregar nuevo producto");

        jSeparator1.setForeground(new java.awt.Color(41, 168, 73));

        btt_inventario.setBackground(new java.awt.Color(255, 255, 255));
        btt_inventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add1.png"))); // NOI18N
        btt_inventario.setBorder(null);
        btt_inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_inventarioActionPerformed(evt);
            }
        });

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

        jLabel14.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Id Producto: ");

        jSeparator8.setForeground(new java.awt.Color(41, 168, 73));

        btt_inventario1.setBackground(new java.awt.Color(255, 255, 255));
        btt_inventario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        btt_inventario1.setBorder(null);
        btt_inventario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_inventario1ActionPerformed(evt);
            }
        });

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

        jLabel15.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Editar producto existente");

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

        jLabel19.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Precio compra:");

        pc_field1.setBackground(new java.awt.Color(255, 255, 255));
        pc_field1.setForeground(new java.awt.Color(51, 51, 51));
        pc_field1.setBorder(null);

        jSeparator14.setForeground(new java.awt.Color(41, 168, 73));

        jLabel20.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Precio venta:");

        pv_field1.setBackground(new java.awt.Color(255, 255, 255));
        pv_field1.setForeground(new java.awt.Color(51, 51, 51));
        pv_field1.setBorder(null);

        jSeparator15.setForeground(new java.awt.Color(41, 168, 73));

        javax.swing.GroupLayout verProductosLayout = new javax.swing.GroupLayout(verProductos);
        verProductos.setLayout(verProductosLayout);
        verProductosLayout.setHorizontalGroup(
            verProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, verProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(verProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(verProductosLayout.createSequentialGroup()
                        .addGroup(verProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btt_inventario, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(verProductosLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btt_inventario1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(verProductosLayout.createSequentialGroup()
                        .addGroup(verProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(verProductosLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(verProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(verProductosLayout.createSequentialGroup()
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(verProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jSeparator11)
                                            .addComponent(nombre_field1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(verProductosLayout.createSequentialGroup()
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(verProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jSeparator10)
                                            .addComponent(id_field1, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(verProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(verProductosLayout.createSequentialGroup()
                        .addGroup(verProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(verProductosLayout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(verProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator13)
                                    .addComponent(existencias_field1, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                                .addGap(48, 48, 48))
                            .addGroup(verProductosLayout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(verProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator12)
                                    .addComponent(desc_field1, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(verProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, verProductosLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(verProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator14)
                                    .addComponent(pc_field1, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, verProductosLayout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(verProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator15)
                                    .addComponent(pv_field1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(buscar_field)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator9))
                .addGap(13, 13, 13))
        );
        verProductosLayout.setVerticalGroup(
            verProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verProductosLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(verProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(verProductosLayout.createSequentialGroup()
                        .addGroup(verProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(verProductosLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btt_inventario, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btt_inventario1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(verProductosLayout.createSequentialGroup()
                                .addComponent(buscar_field, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(51, 51, 51)
                        .addGroup(verProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(verProductosLayout.createSequentialGroup()
                                .addGroup(verProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(id_field1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(verProductosLayout.createSequentialGroup()
                                .addGroup(verProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(desc_field1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(verProductosLayout.createSequentialGroup()
                        .addGroup(verProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(pc_field1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(verProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(verProductosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(verProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(verProductosLayout.createSequentialGroup()
                                .addGroup(verProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(nombre_field1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(verProductosLayout.createSequentialGroup()
                                .addGroup(verProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(existencias_field1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, verProductosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(verProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(pv_field1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))))
        );

        jPanel2.add(verProductos, "card2");

        nuevoProducto.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ID Producto:");

        jSeparator2.setForeground(new java.awt.Color(41, 168, 73));

        id_field.setBackground(new java.awt.Color(255, 255, 255));
        id_field.setForeground(new java.awt.Color(204, 204, 204));
        id_field.setText("Ingrese ID del producto");
        id_field.setBorder(null);
        id_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                id_fieldFocusGained(evt);
            }
        });
        id_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_fieldActionPerformed(evt);
            }
        });

        nombre_field.setBackground(new java.awt.Color(255, 255, 255));
        nombre_field.setForeground(new java.awt.Color(204, 204, 204));
        nombre_field.setText("Ingrese nombre del producto");
        nombre_field.setBorder(null);
        nombre_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nombre_fieldFocusGained(evt);
            }
        });
        nombre_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_fieldActionPerformed(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(41, 168, 73));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Nombre:");

        desc_field.setBackground(new java.awt.Color(255, 255, 255));
        desc_field.setForeground(new java.awt.Color(204, 204, 204));
        desc_field.setText("Ingrese descripcion del producto");
        desc_field.setBorder(null);
        desc_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                desc_fieldFocusGained(evt);
            }
        });
        desc_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desc_fieldActionPerformed(evt);
            }
        });

        jSeparator4.setForeground(new java.awt.Color(41, 168, 73));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Descripcion:");

        jLabel9.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Existencias:");

        existencias_field.setBackground(new java.awt.Color(255, 255, 255));
        existencias_field.setForeground(new java.awt.Color(204, 204, 204));
        existencias_field.setText("Ingrese existencias del producto");
        existencias_field.setBorder(null);
        existencias_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                existencias_fieldFocusGained(evt);
            }
        });
        existencias_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                existencias_fieldActionPerformed(evt);
            }
        });

        jSeparator5.setForeground(new java.awt.Color(41, 168, 73));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Precio compra:");

        pc_field.setBackground(new java.awt.Color(255, 255, 255));
        pc_field.setForeground(new java.awt.Color(204, 204, 204));
        pc_field.setText("Ingrese precio adquisición");
        pc_field.setBorder(null);
        pc_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pc_fieldFocusGained(evt);
            }
        });
        pc_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pc_fieldActionPerformed(evt);
            }
        });

        jSeparator6.setForeground(new java.awt.Color(41, 168, 73));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Precio venta:");

        pv_field.setBackground(new java.awt.Color(255, 255, 255));
        pv_field.setForeground(new java.awt.Color(204, 204, 204));
        pv_field.setText("Ingrese precio de venta");
        pv_field.setBorder(null);
        pv_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pv_fieldFocusGained(evt);
            }
        });
        pv_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pv_fieldActionPerformed(evt);
            }
        });

        jSeparator7.setForeground(new java.awt.Color(41, 168, 73));

        btt_regresar.setBackground(new java.awt.Color(255, 255, 255));
        btt_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        btt_regresar.setBorder(null);
        btt_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_regresarActionPerformed(evt);
            }
        });

        btt_add.setBackground(new java.awt.Color(255, 255, 255));
        btt_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add1.png"))); // NOI18N
        btt_add.setBorder(null);
        btt_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_addActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Agregar producto");

        jLabel13.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Regresar");

        javax.swing.GroupLayout nuevoProductoLayout = new javax.swing.GroupLayout(nuevoProducto);
        nuevoProducto.setLayout(nuevoProductoLayout);
        nuevoProductoLayout.setHorizontalGroup(
            nuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nuevoProductoLayout.createSequentialGroup()
                .addGroup(nuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nuevoProductoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(nuevoProductoLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(nuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(nuevoProductoLayout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(nuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pv_field, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(nuevoProductoLayout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(nuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pc_field, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(nuevoProductoLayout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(nuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(existencias_field, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(nuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(nuevoProductoLayout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(nuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator3)
                                        .addComponent(nombre_field, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(nuevoProductoLayout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(nuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator2)
                                        .addComponent(id_field, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(nuevoProductoLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(nuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(desc_field, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 266, Short.MAX_VALUE)
                        .addComponent(btt_add, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)))
                .addGroup(nuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btt_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        nuevoProductoLayout.setVerticalGroup(
            nuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nuevoProductoLayout.createSequentialGroup()
                .addGroup(nuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nuevoProductoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(nuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btt_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btt_add, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(nuevoProductoLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(nuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(id_field, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(nuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(nombre_field, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(nuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(desc_field, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(nuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(existencias_field, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(nuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(pc_field, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(nuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(pv_field, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)))
                .addGroup(nuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(16, 16, 16))
        );

        jPanel2.add(nuevoProducto, "card3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btt_inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_inventarioActionPerformed
        nuevoProducto.show();
        verProductos.hide();
    }//GEN-LAST:event_btt_inventarioActionPerformed

    private void id_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_fieldActionPerformed

    private void nombre_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_fieldActionPerformed

    private void desc_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desc_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_desc_fieldActionPerformed

    private void existencias_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_existencias_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_existencias_fieldActionPerformed

    private void pc_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pc_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pc_fieldActionPerformed

    private void pv_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pv_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pv_fieldActionPerformed

    private void btt_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_regresarActionPerformed
        // TODO add your handling code here:
        consultaInventario consulta1 = new consultaInventario();
        verProductos.show();
        nuevoProducto.hide();
        consulta1.start();
    }//GEN-LAST:event_btt_regresarActionPerformed

    private void btt_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_addActionPerformed
        // TODO add your handling code here:
        id = id_field.getText();
        nombre = nombre_field.getText();
        descripcion = desc_field.getText();
        existencias = Integer.valueOf(existencias_field.getText());
        precioC = Double.valueOf(pc_field.getText());
        precioV = Double.valueOf(pv_field.getText());
        if(verificar() == true){
            ingresarProductos(id, nombre, descripcion, existencias, precioC, precioV);
        }else{
            JOptionPane.showMessageDialog(null, "Comprobar ingreso de datos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btt_addActionPerformed

    private void id_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_id_fieldFocusGained
        // TODO add your handling code here:
        id_field.setText("");
        id_field.setForeground(Color.BLACK);
    }//GEN-LAST:event_id_fieldFocusGained

    private void nombre_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombre_fieldFocusGained
        // TODO add your handling code here:
        nombre_field.setText("");
        nombre_field.setForeground(Color.BLACK);
    }//GEN-LAST:event_nombre_fieldFocusGained

    private void desc_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_desc_fieldFocusGained
        // TODO add your handling code here:
        desc_field.setText("");
        desc_field.setForeground(Color.BLACK);
    }//GEN-LAST:event_desc_fieldFocusGained

    private void existencias_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_existencias_fieldFocusGained
        // TODO add your handling code here:
        existencias_field.setText("");
        existencias_field.setForeground(Color.BLACK);
    }//GEN-LAST:event_existencias_fieldFocusGained

    private void pc_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pc_fieldFocusGained
        // TODO add your handling code here:
        pc_field.setText("");
        pc_field.setForeground(Color.BLACK);
    }//GEN-LAST:event_pc_fieldFocusGained

    private void pv_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pv_fieldFocusGained
        // TODO add your handling code here:
        pv_field.setText("");
        pv_field.setForeground(Color.BLACK);
    }//GEN-LAST:event_pv_fieldFocusGained

    private void btt_inventario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_inventario1ActionPerformed
        // TODO add your handling code here:
        actualizarDatos();
        consultaInventario consulta2 = new consultaInventario();
        consulta2.start();
        vaciarEditar();
    }//GEN-LAST:event_btt_inventario1ActionPerformed

    private void buscar_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_buscar_fieldFocusGained
        // TODO add your handling code here:
        buscar_field.setText("");
        buscar_field.setForeground(Color.black);
    }//GEN-LAST:event_buscar_fieldFocusGained

    private void buscar_fieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscar_fieldKeyReleased
        // TODO add your handling code here:
        filtro(buscar_field.getText(), jTable1,1);
    }//GEN-LAST:event_buscar_fieldKeyReleased

    private void buscar_fieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_buscar_fieldFocusLost
        // TODO add your handling code here:
        Color texto = new Color(204, 204, 204);
        buscar_field.setText("Buscar producto por nombre");
        buscar_field.setForeground(texto);
    }//GEN-LAST:event_buscar_fieldFocusLost

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTable1KeyPressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel tabla = (DefaultTableModel)jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
        id_field1.setText(tabla.getValueAt(selectedRow, 0).toString());
        nombre_field1.setText(tabla.getValueAt(selectedRow, 1).toString());
        desc_field1.setText(tabla.getValueAt(selectedRow, 2).toString());
        existencias_field1.setText(tabla.getValueAt(selectedRow, 3).toString());
        pc_field1.setText(tabla.getValueAt(selectedRow, 4).toString());
        pv_field1.setText(tabla.getValueAt(selectedRow, 5).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inventario().setVisible(true);
            }
        });
    }
    
    public void vaciarEditar(){
        id_field1.setText("");
        nombre_field1.setText("");
        desc_field1.setText("");
        existencias_field1.setText("");
        pc_field1.setText("");
        pv_field1.setText("");
    }
    
    public void vaciarTabla(){
        DefaultTableModel Modelo = (DefaultTableModel) jTable1.getModel();
        String titulos[] = {"ID Producto","Nombre","Descripcion","Existencias","Precio Compras", "Precio Ventas"};
        Modelo = new DefaultTableModel(null,titulos);
        jTable1.setModel(Modelo);
    }
    
    public void actualizarDatos(){
        try{
            Connection con = null;
            ConexionDB conect = new ConexionDB();
            con = conect.conectarMySQL();
            Statement st = con.createStatement();
            String sql = "update inventario set nombre_producto = ?, descripcion = ?, existencias = ?, precio_compra = ?, precio_venta = ? where id_producto = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, nombre_field1.getText());
            pst.setString(2,desc_field1.getText());
            pst.setInt(3, Integer.valueOf(existencias_field1.getText()));
            pst.setDouble(4,Double.valueOf(pc_field1.getText()));
            pst.setDouble(5,Double.valueOf(pv_field1.getText()));
            pst.setString(6, id_field1.getText());
            int n = pst.executeUpdate();
            if (n > 0){
                JOptionPane.showMessageDialog(this, "DATOS ACTUALIZADOS CORRECTAMENTE");
            }
        }catch (SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(this, "LOS DATOS NO HAN SIDO ACTUALIZADOS CORRECTAMENTE", "Error", JOptionPane.ERROR_MESSAGE);
        }
    
    }
    
     public void verDatos(){
        try {
            Connection con1 = null;
            DefaultTableModel miModelo = (DefaultTableModel) jTable1.getModel();
            ConexionDB conect1 = new ConexionDB();
            com.mysql.jdbc.Connection cn = conect1.conectarMySQL();
            String dts[] = new String[6];
            String sql = "SELECT id_producto, nombre_producto, descripcion, existencias, precio_compra, precio_venta FROM inventario";
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                dts[0] = rs.getString("id_producto");
                dts[1] = rs.getString("nombre_producto");
                dts[2] = rs.getString("descripcion");
                dts[3] = rs.getString("existencias");
                dts[4] = rs.getString("precio_compra");
                dts[5] = rs.getString("precio_venta");
                miModelo.addRow(dts);
            }
            jTable1.setModel(miModelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "NO SE PUEDEN VISUALIZAR LOS DATOS DE LA TABLA", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public boolean verificar(){
        if(id_field.getText().equals("") && nombre_field.getText().equals("") && desc_field.getText().equals("") && existencias_field.getText().equals("") && pc_field.getText().equals("") && pv_field.getText().equals("")){
            return false;
        }else{
            return true;
        }
    }
    public void vaciarFields(){
        Color texto = new Color(204, 204, 204);
        pv_field.setForeground(texto);
        pc_field.setForeground(texto);
        existencias_field.setForeground(texto);
        desc_field.setForeground(texto);
        nombre_field.setForeground(texto);
        id_field.setForeground(texto);
        
        id_field.setText("Ingrese ID del producto");
        nombre_field.setText("Ingrese nombre del producto");
        desc_field.setText("Ingrese descripcion del producto");
        existencias_field.setText("Ingrese existencias del producto");
        pc_field.setText("Ingrese precio adquisicion");
        pv_field.setText("Ingrese precio de venta");
        
    }
    
    public void ingresarProductos(String idI, String nombreI, String descripcionI, int existenciasI, double precioCI, double precioVI){
        try {
            Connection con = null;
            ConexionDB conect = new ConexionDB();
            con = conect.conectarMySQL();
            Statement st = con.createStatement();
            String sql = "insert into inventario (id_producto,nombre_producto,descripcion,existencias,precio_compra,precio_venta) values(?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, idI);
            pst.setString(2, nombreI);
            pst.setString(3, descripcionI);
            pst.setInt(4, existenciasI);
            pst.setDouble(5, precioCI);
            pst.setDouble(6, precioVI);
            int n = pst.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(this, "DATOS GUARDADOS CORRECTAMENTE");
                vaciarFields();
            }
        }catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(this, "LOS DATOS NO HAN SIDO GUARDADOS CORRECTAMENTE", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
     
    public class consultaInventario extends Thread {
        @Override
        public void run() {
            vaciarTabla();
            verDatos();
        }
    }
    
    private void filtro(String consulta, JTable jtableBuscar, int row){
        dm = (DefaultTableModel) jtableBuscar.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(dm);
        jtableBuscar.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(consulta,row));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btt_add;
    private javax.swing.JButton btt_inventario;
    private javax.swing.JButton btt_inventario1;
    private javax.swing.JButton btt_regresar;
    private javax.swing.JTextField buscar_field;
    private javax.swing.JTextField desc_field;
    private javax.swing.JTextField desc_field1;
    private javax.swing.JTextField existencias_field;
    private javax.swing.JTextField existencias_field1;
    private javax.swing.JTextField id_field;
    private javax.swing.JTextField id_field1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nombre_field;
    private javax.swing.JTextField nombre_field1;
    private javax.swing.JPanel nuevoProducto;
    private javax.swing.JTextField pc_field;
    private javax.swing.JTextField pc_field1;
    private javax.swing.JTextField pv_field;
    private javax.swing.JTextField pv_field1;
    private javax.swing.JPanel verProductos;
    // End of variables declaration//GEN-END:variables
}
