package archivosherelisables;

import deber.futbolista;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class leer_Escribir {

    public void escribirArchivo(String rutArchivo, persona persona) {

        try {
            ObjectOutputStream ejemplo = new ObjectOutputStream(new FileOutputStream(rutArchivo));
            ejemplo.writeObject(persona);
            ejemplo.close();
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }

    public void leerArchivo(String rutArchivo) {
        try {
            ObjectInputStream leer = new ObjectInputStream(new FileInputStream(rutArchivo));
            Object aux = leer.readObject();
            while (aux != null) {
                persona persona = (persona) aux;
                System.out.println(persona.getMascota().getNombre());
                aux = leer.readObject();
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }
    public void escribirlista(String direccionArchivo, List<persona> listapersona) {
        try {
            ObjectOutputStream leer = new ObjectOutputStream(new FileOutputStream(direccionArchivo));
            for (persona persona : listapersona) {
                leer.writeObject(persona);
                
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }

    public List<persona> lista(String rutArchivo) {
         List<persona> lista = new ArrayList<>();
try {
    ObjectInputStream leer = new ObjectInputStream(new FileInputStream(rutArchivo));
    Object aux = leer.readObject();
    while (aux != null) {
        persona persona = (persona) aux;
                lista.add(persona);
                aux = leer.readObject();
            }
    } catch (Exception e) {        
}
        return lista;
    }

    public static void main(String[] args) {
     
        leer_Escribir objeto = new leer_Escribir();
        persona objeto1 = new persona("Alexander", "celi", 15, new mascota("oso", 4));
//        objeto.escribirArchivo("C:\\Users\\Max\\Desktop\\ejemplo.txt", objeto1);
//        objeto.leerArchivo("C:\\Users\\Max\\Desktop\\ejemplo.txt");
        persona objeto2 = new persona("Pedro", "Escamoso", 21, new mascota("choper", 4));
        persona objeto3 = new persona("Kakashi", "hatake", 20, new mascota("akamaru", 4));
        persona objeto4 = new persona("Juan", "fernandez", 18, new mascota("iker", 4));
        List<persona> lista = new ArrayList<>();
        lista.add(objeto1);
        lista.add(objeto2);
        lista.add(objeto3);
        lista.add(objeto4);
        objeto.escribirlista("C:\\Users\\Max\\Desktop\\ejemplo.txt", lista);
        objeto.leerArchivo("C:\\Users\\Max\\Desktop\\ejemplo.txt");
         List<persona> lista1 = objeto.lista("C:\\Users\\Max\\Desktop\\ejemplo.txt");
        for (persona persona : lista) {
            System.out.println(persona.getNombre());
        }
    }

    
}
