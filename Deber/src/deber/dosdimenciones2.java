
package deber;

public class dosdimenciones2 {
     private double base;
    private double altura;
    
    double getBase (){return base;}
    double getALtura(){return altura;}
    void setBase (double b) {base=b;}
    void setAltura (double h ) {altura=h;}
    
    void mostrarDimensiones (){
        System.out.println("La base y altura es :" + base + "y" + altura);
        
    }

}
