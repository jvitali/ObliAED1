
package obligatorio;

public class Obligatorio {

    public static void main(String[] args) {
        int ciudades [][]={{0,1,2,3,0},{1,0,2,0,2},{2,2,0,1,3},{3,0,2,0,1},{0,2,3,1,0}};
        Prueba p = new Prueba();
        Sistema s=new Sistema(10);
        s.AgregarCarpeta("C", "NombresClasicos");
        s.CrearSistemaMensajes();
        s.AgregarMensaje("C", "NombresClasicos", "Archivo1.txt");
        
    }
    
}
