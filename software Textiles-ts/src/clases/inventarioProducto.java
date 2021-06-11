package clases;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jossu
 */
public class inventarioProducto{
    private String id, nombre, descripcion;
    private int existencias;
    private double precioC, precioV;
    private boolean confirmacion;
    public ArrayList<String[]> datosObtenidos = new ArrayList<String[]>();

    
    public boolean ingresarProductoNuevo(String id, String nombreProducto, String descripcionP, int existenciasP, double PrecioCompraP, double precioVentaP){
        try {
            Connection con = null;
            ConexionDB conect = new ConexionDB();
            con = conect.conectarMySQL();
            Statement st = con.createStatement();
            String sql = "insert into inventario (id_producto,nombre_producto,descripcion,existencias,precio_compra,precio_venta) values(?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, id);
            pst.setString(2, nombreProducto);
            pst.setString(3, descripcionP);
            pst.setInt(4, existenciasP);
            pst.setDouble(5, PrecioCompraP);
            pst.setDouble(6, precioVentaP);
            int n = pst.executeUpdate();
            if (n > 0) {
                confirmacion = true;
                return confirmacion;
            }
            st.close();
            con.close();
            pst.close();
        }catch (SQLException | HeadlessException e) {
            confirmacion = false;
            return confirmacion;
        }
        
        return false;
    }
    
    public boolean verificar(String id, String nombreProducto, String descripcionP, String existenciasP, String PrecioCompraP, String precioVentaP){
        if(id.equals("") && nombreProducto.equals("") && descripcionP.equals("") && existenciasP.equals("") && PrecioCompraP.equals("") && precioVentaP.equals("")){
            return false;
        }else{
            return true;
        }
    }
    

    public ArrayList<informacionProducto> verDatosProductosInventario(){
        ArrayList<informacionProducto> datosObtenidos = new ArrayList<informacionProducto>();
        try {
            Connection con1 = null;
            ConexionDB conect1 = new ConexionDB();
            com.mysql.jdbc.Connection cn = conect1.conectarMySQL();
            String sql = "SELECT id_producto, nombre_producto, descripcion, existencias, precio_compra, precio_venta FROM inventario";
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                informacionProducto productoInformacion = new informacionProducto(rs.getString("id_producto"), rs.getString("nombre_producto"), 
                        rs.getString("descripcion"), rs.getString("existencias"), rs.getString("precio_compra"), rs.getString("precio_venta"));
                datosObtenidos.add(productoInformacion);
            }
            rs.close();
            st.close();
            cn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "NO SE PUEDEN VISUALIZAR LOS DATOS DE LA TABLA", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return datosObtenidos;
    }
    
    public boolean editarProductoExistente(String id, String nombreProducto, String descripcionP, int existenciasP, double PrecioCompraP, double precioVentaP){
        try{
            Connection con = null;
            ConexionDB conect = new ConexionDB();
            con = conect.conectarMySQL();
            Statement st = con.createStatement();
            String sql = "update inventario set nombre_producto = ?, descripcion = ?, existencias = ?, precio_compra = ?, precio_venta = ? where id_producto = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, nombreProducto);
            pst.setString(2, descripcionP);
            pst.setInt(3, existenciasP);
            pst.setDouble(4, PrecioCompraP);
            pst.setDouble(5, precioVentaP);
            pst.setString(6, id);
            int n = pst.executeUpdate();
            if (n > 0){
                return true;
            }
        }catch (SQLException | HeadlessException e){
            return false;
        }
        return false;
    }
    
    
    
 
}
