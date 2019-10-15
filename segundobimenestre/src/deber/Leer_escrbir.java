package deber;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Leer_escrbir {

    public void escribirArchivo(String rutArchivo, futbolista futbolista) {

        try {
            ObjectOutputStream ejemplo = new ObjectOutputStream(new FileOutputStream(rutArchivo));
            ejemplo.writeObject(futbolista);
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
                futbolista futbolista = (futbolista) aux;
                System.out.println(futbolista.getEquipo().getNombreequipo());
                aux = leer.readObject();
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }

    public void escribirlista(String direccionArchivo, List<futbolista> listafutbolista) {
        try {
            ObjectOutputStream leer = new ObjectOutputStream(new FileOutputStream(direccionArchivo));
            for (futbolista futbolista : listafutbolista) {
                leer.writeObject(futbolista);

            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }

    public List<futbolista> lista(String rutArchivo) {
        List<futbolista> lista = new ArrayList<>();
        try {
            ObjectInputStream leer = new ObjectInputStream(new FileInputStream(rutArchivo));
            Object aux = leer.readObject();
            while (aux != null) {
                futbolista futbolista = (futbolista) aux;
                lista.add(futbolista);
                aux = leer.readObject();
            }
        } catch (Exception e) {
        }
        return lista;
    }

    public futbolista verificador_edad(List<futbolista> listafutbolista) {
        futbolista menor = listafutbolista.get(0);
        for (futbolista futbolista : listafutbolista) {
            if (menor.getAños() > menor.getAños()) {
                menor = futbolista;
            }
        }
        return menor;

    }
public futbolista titulos(List<futbolista> listafutbolista) {
        futbolista goles = listafutbolista.get(0);
        for (futbolista futbolista : listafutbolista) {
//            if (goles.getEquipo() <= goles.getNumero()) {
//                goles = futbolista;
//            } else {
//            }
        }
        return goles;

    }
    public static void main(String[] args) {

        
        Leer_escrbir objeto = new Leer_escrbir();
        futbolista objeto1 = new futbolista(10, "Delantero", 25, "derecha", "Alexander", new equipo("primera divicion", 63, 100, 5, "Sporting Cristal"));
        futbolista objeto2 = new futbolista(9, "Latera Derecho", 30, "derecha", "Hernan", new equipo("Segunda vicion", 45, 220, 0, "Juventus"));
        futbolista objeto3 = new futbolista(7, "Lateral Iquierdo", 27, "Izquierda", "Juan", new equipo("Serie A", 57, 30, 18, "Sporting Lisboa"));
        futbolista objeto4 = new futbolista(20, "Portero", 22, "derecha", "Pedro", new equipo("Premier league", 67, 150, 12, "Cataluña"));
        futbolista objeto5 = new futbolista(15, "Defensa Central", 45, "Diestro", "Vicente", new equipo("primera divicion", 50, 100, 10, "Angeles Galaxi"));
        futbolista objeto6 = new futbolista(12, "Delanero", 45, "Diestro", "Juan", new equipo("primera divicion", 50, 100, 10, "Real Madrid"));
        futbolista objeto7 = new futbolista(16, "Delantero", 45, "Diestro", "Luis", new equipo("primera divicion", 50, 100, 10, "Arsenal"));
        futbolista objeto8 = new futbolista(17, "Defensa Central", 45, "Diestro", "Alexander", new equipo("primera divicion", 50, 100, 10, "Chelse"));
        futbolista objeto9 = new futbolista(16, "Arquero", 45, "Diestro", "Jhon", new equipo("primera divicion", 50, 100, 10, "Manchester Unidat"));
        futbolista objeto10 = new futbolista(18, "Defensa Central", 45, "Diestro", "Boris", new equipo("primera divicion", 50, 100, 10, "Manchester city"));

        List<futbolista> lista = new ArrayList<>();
        lista.add(objeto1);
        lista.add(objeto2);
        lista.add(objeto3);
        lista.add(objeto4);
        lista.add(objeto5);
        lista.add(objeto6);
        lista.add(objeto7);
        lista.add(objeto8);
        lista.add(objeto9);
        lista.add(objeto10);
        objeto.escribirlista("C:\\Users\\Max\\Desktop\\ejercicio1.txt", lista);
        objeto.leerArchivo("C:\\Users\\Max\\Desktop\\ejercicio1.txt");
        List<futbolista> lista1 = objeto.lista("C:\\Users\\Max\\Desktop\\ejercicio1.txt");
        for (futbolista futbolista : lista) {
            System.out.println(futbolista.getNombre());
        }
        System.out.println(objeto.verificador_edad(lista1));
    }
}
