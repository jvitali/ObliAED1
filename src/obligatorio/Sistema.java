package obligatorio;

import obligatorio.Interfaces.ISistema;
import obligatorio.Listas.ListaCarpetas;
import obligatorio.Listas.ListaPalabras;
import obligatorio.Nodos.NodoArchivo;
import obligatorio.Nodos.NodoCarpeta;

public class Sistema implements ISistema {

    int maxCantPalabras;
    int ciudades[][];
    ListaCarpetas carpetas;
    ListaPalabras diccionario;

    public Sistema(int maxCantPalabras) {
        this.maxCantPalabras = maxCantPalabras;
        this.carpetas = new ListaCarpetas();
    }
    
    

    @Override
    public Retorno CrearSistemaMensajes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Retorno DestruirSistemaMensajes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Retorno AgregarCarpeta(String unidad, String carpeta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Retorno EliminarCarpeta(String unidad, String carpeta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Retorno ListarEstructura(String unidad, String carpeta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Retorno AgregarMensaje(String unidad, String carpeta, String mensaje) {
        NodoArchivo nuevo = new NodoArchivo(mensaje);
        //en lugar de ser get inicio deberia ser buscar por unidad y nombre carpeta
        carpetas.getInicio().getArchivos().Agregar(nuevo);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Retorno EliminarMensaje(String unidad, String carpeta, String mensaje) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Retorno InsertarLinea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Retorno InsertarLineaEnPosicion(int posicionLinea) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Retorno BorrarLinea(int posicionLinea) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Retorno BorrarTodo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Retorno BorrarOcurrenciasPalabraEnTexto(String palabraABorrar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Retorno ImprimirTexto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Retorno InsertarPalabraEnLinea(int posicionLinea, int posicionPalabra, String palabraAIngresar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Retorno InsertarPalabraYDesplazar(int posicionLinea, int posicionPalabra, String palabraAIngresar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Retorno BorrarPalabra(int posicionLinea, int posicionPalabra) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Retorno BorrarOcurrenciasPalabraEnLinea(int posicionLinea, String palabraABorrar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Retorno ImprimirLinea(int posicionLinea) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Retorno IngresarPalabraDiccionario(String palabraAIngresar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Retorno BorrarPalabraDiccionario(String palabraABorrar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Retorno ImprimirDiccionario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Retorno ImprimirTextoIncorrecto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Retorno CargarDistancias(int[][] Ciudades) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Retorno BuscarCamino(int[][] M, String origen, String destino) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
