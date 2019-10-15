/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repaso;
import java.util.Scanner;


public class Serie3 {
public static int[] serie3 (int limite){
 int []numero = new int [limite];  
 int n=60,d=2,m = 60;
 for (int i = 0; i < limite; i++) {
     numero [i] =n;
     numero[i]=m;
     m= n/d;
     d++;
     if (d>=7){
     d=1;
     }
 }return numero;

}
  public int generado(int numero[]){
  Scanner dato = new Scanner(System.in);
      System.out.println("\nIngrese un numero");
  int x= dato.nextInt();
    System.out.println("Ingrese un numero");
  int y= dato.nextInt();
      if (x<=0 && x>255 && y<=0 && y>255  )  {
  return -1;
  }else{
  x=x+y;
  x = numero[x];
  return x;
  }   
  
  }
    public static void main(String[] args) {
        Scanner dato = new Scanner (System.in);
     int [] numero = serie3(35);
     Serie3 obj= new Serie3();
     for (int i = 0; i < numero.length; i++) {
        System.out.println(obj.serie3(i)) ; }
//        for (int i = 0; i < numero.length; i++) {
//            System.out.print(numero[i]+",");    
//        } 
        
    }
    
 
   
}