
package obligatorio;

public class Obligatorio {
    
    public static void main(String[] args) {
        int ciudades [][]={{0,1,2,3,0},{1,0,2,0,2},{2,2,0,1,3},{3,0,2,0,1},{0,2,3,1,0}};
        Prueba p = new Prueba();
        Sistema s=new Sistema(10);
        
        String unidad = "C";
        
        ProbarCorrectos(p, s, unidad);
        ProbarErrores(p, s, unidad);
     }
    
    public static void ProbarCorrectos(Prueba p, Sistema s,String unidad){
        p.ver(s.CrearSistemaMensajes().resultado, Retorno.Resultado.OK, "Se creo el sistema de mensajes");
        p.ver(s.AgregarCarpeta(unidad, "Carpeta 1").resultado, Retorno.Resultado.OK, "Carpeta 1");
    }
    
    public  static void ProbarErrores(Prueba p,Sistema s,String unidad){
        p.ver(s.CrearSistemaMensajes().resultado, Retorno.Resultado.OK, "Se creo el sistema de mensajes");
    }
    
}
