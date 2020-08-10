package Ventanas;



import java.sql.Connection;
import java.sql.DriverManager;




public class ConexionBD {

    private static String bd = "Prueba";
    private static String user  = "root";
    private static String pass  = "";
    private static String URL   = "jdbc:mysql://127.0.0.1 "+bd+"?useTimezone=true&serverTimezone=UTC";
    
    
    public Connection getConexionBD(){
        Connection cn =null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection(URL, user, pass);
        } catch (Exception e) {
            System.out.println("Error en la conexion"+e.getMessage());
        }
        return cn;
    
    }
    
        
        
        
    }
    

    

