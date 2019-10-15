package segundobimenestre;

public class Segundobimenestre {

    public static void main(String[] args) {
        String cadena = "hola";
//        System.out.println(cadena.length());
//        System.out.println(cadena.equals("chao"));
//        System.out.println(cadena.contains("d"));
Segundobimenestre objeto = new Segundobimenestre();
objeto.verificarLetra("hola", 'd');
    }
public boolean verificarLetra(String cadena, char letra){
    boolean bandera=false;
    for(int i=0 ;i<cadena.length(); i++){
        if(cadena.charAt(i)==letra){
            bandera=true;
        }
    } 
            
            return bandera;
}
}
