package base_de_datos;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class conexion {

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

    public void scribir(String usuario, String clave, int idepersona, String nombre, String apellido, String cedula, int edad) {
        try {
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            Connection poo = DriverManager.getConnection("jdbc:mysql://localhost/futbolista", usuario, clave);
            PreparedStatement s = poo.prepareStatement("insert into persona persona values(?,?,?,?,?) ");
            s.setInt(1, idepersona);
            s.setString(2, nombre);
            s.setString(3, apellido);
            s.setString(4, cedula);
            s.setInt(5, edad);
            s.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        conexion conec = new conexion();
//      conec.conexion("root", "root");
//      conec.scribir("root", "root", 11, "Pedrito", "Lalangui", "1121244214", 43);
//      conec.scribir("root", "root", 12, "karen ", "lanche", "1121211114", 35);
//      conec.actualizar("root", "root", 4, "Vicente", "suarez", "070680852");
//        conec.eliminar("root", "root", 4);
conec.scribir("root", "root", 1, "Romeo", "XD", "1900681667", 6);
    }

    public void actualizar(String usuario, String clave, int idepersona, String nombre, String apellido, String cedula) {
        try {
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            Connection poo = DriverManager.getConnection("jdbc:mysql://localhost/futbolista", usuario, clave);
            PreparedStatement s = poo.prepareStatement("UPDATE  persona set nombre=?, apellido=?, cedula=? where idpersona=? ");
            s.setString(1, nombre);
            s.setString(2, apellido);
            s.setString(3, cedula);
            s.setInt(4, idepersona);

            s.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);

        }
    }

    public void eliminar(String usuario, String clave, int idepersona) {
        try {
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            Connection poo = DriverManager.getConnection("jdbc:mysql://localhost/futbolista", usuario, clave);
            PreparedStatement s = poo.prepareStatement("DELETE from  persona  where idpersona=?");

            s.setInt(1, idepersona);

            s.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);

        }
    }
}
