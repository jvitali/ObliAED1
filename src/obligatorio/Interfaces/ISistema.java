package obligatorio.Interfaces;

import obligatorio.Retorno;

public interface ISistema {

    //Operaciones sobre Sistema
    public Retorno CrearSistemaMensajes();

    public Retorno DestruirSistemaMensajes();

    //Operaciones sobre Carpetas
    public Retorno AgregarCarpeta(String unidad, String carpeta);

    public Retorno EliminarCarpeta(String unidad, String carpeta);

    public Retorno ListarEstructura(String unidad, String carpeta);

    public Retorno AgregarMensaje(String unidad, String carpeta, String mensaje);

    public Retorno EliminarMensaje(String unidad, String carpeta, String mensaje);

    //Operaciones sobre Archivos
    public Retorno InsertarLinea();

    public Retorno InsertarLineaEnPosicion(int posicionLinea);

    public Retorno BorrarLinea(int posicionLinea);

    public Retorno BorrarTodo();

    public Retorno BorrarOcurrenciasPalabraEnTexto(String palabraABorrar);

    public Retorno ImprimirTexto();

    //Operaciones sobre Lineas 
    public Retorno InsertarPalabraEnLinea(int posicionLinea, int posicionPalabra, String palabraAIngresar);

    public Retorno InsertarPalabraYDesplazar(int posicionLinea, int posicionPalabra, String palabraAIngresar);

    public Retorno BorrarPalabra(int posicionLinea, int posicionPalabra);

    public Retorno BorrarOcurrenciasPalabraEnLinea(int posicionLinea, String palabraABorrar);

    public Retorno ImprimirLinea(int posicionLinea);
    
    //Operaciones de Diccionario
    public Retorno IngresarPalabraDiccionario(String palabraAIngresar);

    public Retorno BorrarPalabraDiccionario(String palabraABorrar);

    public Retorno ImprimirDiccionario();

    public Retorno ImprimirTextoIncorrecto();

    //Ejercicos 3
    public Retorno CargarDistancias(int[][] Ciudades);

    public Retorno BuscarCamino(int[][] M, String origen, String destino);
}
