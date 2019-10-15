package ejercicio;
import java.util.HashMap;
import java.util.Map;
public class ejercicio {
 
    public static void main(String[] args) {
        //Creamos un map
HashMap map = new HashMap();
//Añadimos los valores
map.put("nombre", "Pepe");
map.put("telefono", 66666666);
map.put("direccion", "calle grande 1");
//recuperamos los valores
System.out.println(map.get("nombre").toString());
System.out.println(map.get("telefono").toString());
System.out.println(map.get("direccion").toString());
    }
}