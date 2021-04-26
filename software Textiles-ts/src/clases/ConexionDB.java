package clases;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    private Connection conexion;
    private final String driver = "com.mysql.jdbc.Driver";
    private final String base = "prueba";//<- Esto cambiarlo sin duda
    private final String host = "localhost:3306";//<- Cambiar esto
    private final String puerto = "3306";//<- Posiblemente eso
    private final String url = "jdbc:mysql://" + host + "/" + base;
    private final String user = "root";
    private final String password = "1234";
    
    
   public Connection conectarMySQL(){
       conexion = null;
       try {
           Class.forName(driver);
           conexion = (Connection) DriverManager.getConnection(url,user,password);
           System.out.println(url);
           System.out.println("conectado");
       } catch (ClassNotFoundException | SQLException e) {
           System.out.println("error");
       }
       return conexion;
   }
   
   public void Desconectar(){
       try {
           this.conexion.close();
       } catch (Exception e) {
       }
   
   }
}
