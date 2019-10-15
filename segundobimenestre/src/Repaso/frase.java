/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repaso;
import java.util.*;


public class frase {
    public String[] invertirpalabras(String cadena){
   String texto[]= cadena.split(" ");
        for (int i = texto.length ; i == 0; i--) {
            System.out.println(texto[i]);
        }
//   [1,3,5,6,7]
   
   return texto;
 
       
    }
    public static void main(String[] args) {
     
        frase obj = new frase();
        System.out.println(obj.invertirpalabras("holi boli"));
    }
   
}