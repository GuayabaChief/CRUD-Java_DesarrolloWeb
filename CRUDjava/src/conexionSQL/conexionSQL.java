
package conexionSQL;


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author jerry
 */
public class conexionSQL {
    Connection conectar=null;
    
    public Connection conexion(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/base","root","aca va la contraseña");
            
            JOptionPane.showMessageDialog(null,"Conexion Exitosa");
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error Conexion" + e.getMessage());
        }
        return conectar;
    }
}