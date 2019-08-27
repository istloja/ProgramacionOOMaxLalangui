package archivosherelisables;

import java.io.Serializable;

public class persona implements Serializable {
 private String nombre;
 private String apellidos;
 private int edad;
 private mascota mascota;

    public persona(String nombre, String apellidos, int edad, mascota mascota) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.mascota = mascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public mascota getMascota() {
        return mascota;
    }

    public void setMascota(mascota mascota) {
        this.mascota = mascota;
    }
    public static void main(String[] args) {
        persona objeto= new persona("Alexander","celi",15, new mascota("oso",4));
        mascota masco=new mascota("pocho",4);
        persona objeto1= new persona("Chenoa","jimenez",17,masco );
        System.out.println("La Mascota de " + objeto.getNombre() + " se llama " + objeto.getMascota().getNombre());
    }
}
