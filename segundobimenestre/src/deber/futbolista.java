package deber;

import java.io.Serializable;

public class futbolista implements Serializable {

    private int numero;
    private String posicion;
    private int años;
    private String pierna_buena;
    private String nombre;
    private equipo equipo;

    public futbolista(int numero, String posicion, int años, String pierna_buena, String nombre, equipo equipo) {
        this.numero = numero;
        this.posicion = posicion;
        this.años = años;
        this.pierna_buena = pierna_buena;
        this.nombre = nombre;
        this.equipo = equipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public String getPierna_buena() {
        return pierna_buena;
    }

    public void setPierna_buena(String pierna_buena) {
        this.pierna_buena = pierna_buena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(equipo equipo) {
        this.equipo = equipo;
    }

    public static void main(String[] args) {
        futbolista objeto1 = new futbolista(10, "Delantero", 25, "derecha", "Alexander", new equipo("primera divicion", 63, 100, 5, "Sporting Cristal"));
        System.out.println("El equipo de " + objeto1.getNombre() + " se llama " + objeto1.getEquipo().getNombreequipo() + " en el cual ocupa la poscion de " + objeto1.posicion);
        futbolista objeto2 = new futbolista(10, "Latera Derecho", 30, "derecha", "Hernan", new equipo("Segunda vicion", 45, 220, 0, "Juventus"));
        System.out.println("El equipo de " + objeto2.getNombre() + " se llama " + objeto2.getEquipo().getNombreequipo() + " en el cual ocupa la poscion de " + objeto2.posicion);
        futbolista objeto3 = new futbolista(10, "Lateral Iquierdo", 27, "Izquierda", "Juan", new equipo("Serie A", 57, 30, 18, "Sporting Lisboa"));
        System.out.println("El equipo de " + objeto3.getNombre() + " se llama " + objeto3.getEquipo().getNombreequipo() + " en el cual ocupa la poscion de " + objeto3.posicion);
        futbolista objeto4 = new futbolista(10, "Portero", 22, "derecha", "Pedro", new equipo("Premier league", 67, 150, 12, "Cataluña"));
        System.out.println("El equipo de " + objeto4.getNombre() + " se llama " + objeto4.getEquipo().getNombreequipo() + " en el cual ocupa la poscion de " + objeto4.posicion);
        futbolista objeto5 = new futbolista(10, "Defensa Central", 45, "Diestro", "Vicente", new equipo("primera divicion", 50, 100, 10, "Angeles Galaxi"));
        System.out.println("El equipo de " + objeto5.getNombre() + " se llama " + objeto5.getEquipo().getNombreequipo() + " en el cual ocupa la poscion de " + objeto5.posicion);
        futbolista objeto6 = new futbolista(10, "Delanero", 45, "Diestro", "Juan", new equipo("primera divicion", 50, 100, 10, "Real Madrid"));
        System.out.println("El equipo de " + objeto6.getNombre() + " se llama " + objeto6.getEquipo().getNombreequipo() + " en el cual ocupa la poscion de " + objeto5.posicion);
        futbolista objeto7 = new futbolista(10, "Delantero", 45, "Diestro", "Luis", new equipo("primera divicion", 50, 100, 10, "Arsenal"));
        System.out.println("El equipo de " + objeto7.getNombre() + " se llama " + objeto7.getEquipo().getNombreequipo() + " en el cual ocupa la poscion de " + objeto5.posicion);
        futbolista objeto8 = new futbolista(10, "Defensa Central", 45, "Diestro", "Alexander", new equipo("primera divicion", 50, 100, 10, "Chelse"));
        System.out.println("El equipo de " + objeto8.getNombre() + " se llama " + objeto8.getEquipo().getNombreequipo() + " en el cual ocupa la poscion de " + objeto5.posicion);
        futbolista objeto9 = new futbolista(10, "Arquero", 45, "Diestro", "Jhon", new equipo("primera divicion", 50, 100, 10, "Manchester Unidat"));
        System.out.println("El equipo de " + objeto9.getNombre() + " se llama " + objeto9.getEquipo().getNombreequipo() + " en el cual ocupa la poscion de " + objeto5.posicion);
        futbolista objeto10 = new futbolista(10, "Defensa Central", 45, "Diestro", "Boris", new equipo("primera divicion", 50, 100, 10, "Manchester city"));
        System.out.println("El equipo de " + objeto10.getNombre() + " se llama " + objeto10.getEquipo().getNombreequipo() + " en el cual ocupa la poscion de " + objeto5.posicion);
        
    }

}
