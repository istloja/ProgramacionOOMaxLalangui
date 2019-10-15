/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repaso;
public class ejercicio10 {
    static boolean validar (int n){
        int contador = 0;
        for (int i = 1; i < n; i++) {
            if (n%i == 0){
            contador = contador+i;
            }
        }
    if( contador == n){
    return true;
    }
 return false;   }

    public static void main(String[] args) {
       
        System.out.println(validar(6));
           
    }

}