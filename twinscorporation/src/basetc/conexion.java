package basetc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.text.Segment;

public class conexion {
	private static final String CONTROLADOR = "com.mysql.jdbc.Driver";
    private static final String URL = "http://localhost/phpmyadmin/export.php";
    private static final String USUARIO = "root";
    private static final String CLAVE = "12345678";
    
    static {
        try {
            Class.forName(CONTROLADOR);
          
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el controlador");
            e.printStackTrace();
        }
    }
    
    public Connection conectar() {
        Connection conexion = null;
        
        try {
            conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);
            System.out.println("Conexión OK");
            System.out.println("Usuario Encontrado");

        } catch (SQLException e) {
            System.out.println("Error en la conexión");
            System.out.println("Usuario No Encontrado");
            e.printStackTrace();
        }
        
        return conexion;
    }
    public String ejecutarQery (String sentencia) {
    	String resp= "";
    	System.out.println(sentencia);
    	Connection comn = conectar ();
    java.sql.PreparedStatement preparedStment;
    try {
        preparedStment = (java.sql.PreparedStatement) comn.prepareStatement(sentencia);
        preparedStment.execute();
        resp= "Se ejecuto correctamente la sentencia en SQL";
        System.out.println("Sentencia ejecutada correctamente...");

    }catch (SQLException e) {
    e.printStackTrace();
    System.out.println("la sentencia"+ sentencia + "no funciono correctamente");
    resp= "Error 1354";
    		
   }   
return resp;
}
    public ResultSet consultarRegistros(String sentencia) throws SQLException {
    	System.out.println(sentencia);
    	Connection conn = conectar ();
    	Segment s = (Segment) conn.createStatement();
    	ResultSet rs = ((java.sql.Statement) s).executeQuery(sentencia);
    	return rs;
    	
    }
    public static void main (String [] args) {
    	conexion cn = new conexion ();
    }
}
