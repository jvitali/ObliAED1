
package obligatorio.Nodos;

public class Paises {
    static String [] ciudades  = {"Montevideo","Santiago","Lima","San Pablo","Panama","New York"};
    
    public static int getPosicion(String ciudad){
        int largo = ciudades.length;
        int pos = 0;
        for (int i = 0; i < largo; i++) {
            if (ciudades[i].equals(ciudad)) {
                pos = i;
            }
        }
        return pos;
    }
    
    public static String getNombre(int posicion){
        int largo = ciudades.length;
        String nombre = "";
        if (posicion < largo && posicion>=0) {
            nombre = ciudades[posicion];
        }
        return nombre;
    }
}
