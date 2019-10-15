
package Repaso;

import java.util.*;

public class NumerodeA {
    
   public int numerodepalabras(String cadena){
   String caracter = "a";
   int numeroveces=0;
  String palabras[]= cadena.split(" ") ;
       for (int i = 0; i < palabras.length  ; i++) {
        if (palabras[i].contains(caracter)){
        numeroveces ++;
        }
       }
       return numeroveces;
   } 

    public static void main(String[] args) {
        NumerodeA obj =new NumerodeA();
        
        
        System.out.println(obj.numerodepalabras("yo soy sofia"));
        }
    }