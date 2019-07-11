/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber;
public class triangulo extends dosdimenciones {
 String estilo;
    double area(){
        return base*altura/2;
    }
    void mostrarEstilo(){
        System.out.println("Triangulo es: "+estilo);
    }
}
class Lados3{
    public static void main(String[] args) {
        triangulo t1=new triangulo();
        triangulo t2=new triangulo();
        t1.base=4.0;
        t1.altura=4.0;
        t1.estilo="Estilo 1";
        t2.base=8.0;
        t2.altura=12.0;
        t2.estilo="Estilo 2";
        System.out.println("Información para T1: ");
        t1.mostrarEstilo();
        t1.mostrarDimension();
        System.out.println("Su área es: "+t1.area());
        System.out.println();
        System.out.println("Información para T2: ");
        t2.mostrarEstilo();
        t2.mostrarDimension();
        System.out.println("Su área es: "+t2.area());
    }    
}
