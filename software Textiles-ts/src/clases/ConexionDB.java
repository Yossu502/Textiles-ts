package clases;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionDB {
    private Connection conexion;
    private String driver = "";
    private String base = "";//<- Esto cambiarlo sin duda
    private String host = "";//<- Cambiar esto
    private String puerto = "";//<- Posiblemente eso
    private String url = "jdbc:mysql://" + host + "/" + base;
    private String user = "";
    private String password = "";
    private static ConexionDB instancia;
    private ArrayList<String> atributos = new ArrayList<String>();

    private ConexionDB() {
        obtenerDatosBD();
    }
    
    public static ConexionDB InstanciaSingleton(){
        if (instancia == null) {
            instancia = new ConexionDB();
        }
        return instancia;
    }
    
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
    
    private void obtenerDatosBD() {
        try {
            File file = new File("src/clases/infoDB.txt");
            Scanner scan = new Scanner(file);
            
            String fileContent = "";
            while (scan.hasNextLine()) {
                scan.nextLine();
                atributos.add(scan.nextLine());
            }
            driver = atributos.get(0);
            base = atributos.get(1);
            host = atributos.get(2);
            puerto = atributos.get(3);
            user = atributos.get(4);
            password = atributos.get(5);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
