package deber;

import java.io.Serializable;

public class equipo implements Serializable{
    private String categoria;
    private int juegodores;
    private int añosdevida;
    private int numeroCopas;
    private String nombreequipo;

    public equipo(String categoria, int juegodores, int añosdevida, int numeroCopas, String nombreequipo) {
        this.categoria = categoria;
        this.juegodores = juegodores;
        this.añosdevida = añosdevida;
        this.numeroCopas = numeroCopas;
        this.nombreequipo = nombreequipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getJuegodores() {
        return juegodores;
    }

    public void setJuegodores(int juegodores) {
        this.juegodores = juegodores;
    }

    public int getAñosdevida() {
        return añosdevida;
    }

    public void setAñosdevida(int añosdevida) {
        this.añosdevida = añosdevida;
    }

    public int getNumeroCopas() {
        return numeroCopas;
    }

    public void setNumeroCopas(int numeroCopas) {
        this.numeroCopas = numeroCopas;
    }

    public String getNombreequipo() {
        return nombreequipo;
    }

    public void setNombreequipo(String nombreequipo) {
        this.nombreequipo = nombreequipo;
    }
    
}
