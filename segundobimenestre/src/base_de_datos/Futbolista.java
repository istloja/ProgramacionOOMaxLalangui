package base_de_datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Futbolista {
    public void conexion(String usuario, String clave) {
        try {
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            Connection poo = DriverManager.getConnection("jdbc:mysql://localhost/futbolista", usuario, clave);
            System.out.println(poo.getCatalog());
            Statement s = poo.createStatement();//inicializamos la consulta
            ResultSet resultado = s.executeQuery("select * from persona");
            while (resultado.next()) {
                System.out.println(resultado.getInt("idpersona"));
                System.out.println(resultado.getString("nombre"));
                System.out.println(resultado.getString("apellido"));
                System.out.println(resultado.getString("cedula"));
                System.out.println(resultado.getInt("edad"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public void scribir(String usuario, String clave, int idepersona, int numero, String nombre, int numerodegoles, int edad) {
        try {
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            Connection poo = DriverManager.getConnection("jdbc:mysql://localhost/futbolista", usuario, clave);
            PreparedStatement s = poo.prepareStatement("insert into futbolista persona values(?,?,?,?,?) ");
            s.setInt(1, idepersona);
            s.setInt(2, numero);
            s.setString(3, nombre);
            s.setInt(4, numerodegoles);
            s.setInt(5, edad);
            s.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
     public static void main(String[] args) {
        conexion conec = new conexion();
      conec.conexion("root", "root");
      conec.scribir("root", "root", 11, "10", "Lalangui", "11", 43);
      
     }
}
