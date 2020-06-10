package obligatorio;

import obligatorio.Interfaces.ISistema;
import obligatorio.Listas.ListaPalabras;
import obligatorio.Listas.ListaUnidades;
import obligatorio.Nodos.NodoUnidad;
import obligatorio.Nodos.NodoArchivo;
import obligatorio.Nodos.NodoCarpeta;

public class Sistema implements ISistema {

    int maxCantPalabras;
    int ciudades[][];
    ListaUnidades unidades;
    ListaPalabras diccionario;

    public Sistema(int maxCantPalabras) {
        this.maxCantPalabras = maxCantPalabras;
        unidades = new ListaUnidades();
        diccionario = new ListaPalabras();
    }

    @Override
    public Retorno CrearSistemaMensajes() {
        Retorno r = new Retorno(Retorno.Resultado.OK);
        NodoUnidad inicio = unidades.getInicio();
        return r;
    }

    @Override
    public Retorno DestruirSistemaMensajes() {
        Retorno r = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return r;
    }

    @Override
    public Retorno AgregarCarpeta(String unidad, String carpeta) { //Que hacer con la unidad
        Retorno r = new Retorno(Retorno.Resultado.OK);
        r.valorBoolean = unidades.getInicio().getCarpetas().Agregar(carpeta); //Si fuera mas de una unidad, en vez de inicio seria buscar
        return r;
    }

    @Override
    public Retorno EliminarCarpeta(String unidad, String carpeta) { //Pregunta
        Retorno r = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        r.valorBoolean = unidades.getInicio().getCarpetas().Borrar(carpeta);
        return r;
    }

    @Override
    public Retorno ListarEstructura(String unidad, String carpeta) { //Solo el contenido de la carpeta???
        Retorno r = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return r;
    }

    @Override
    public Retorno AgregarMensaje(String unidad, String carpeta, String mensaje) {
        NodoArchivo nuevo = new NodoArchivo(mensaje);
        //en lugar de ser get inicio deberia ser buscar por unidad y nombre carpeta
        //carpetas.getInicio().getArchivos().Agregar(nuevo);
        Retorno r = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return r;
    }

    @Override
    public Retorno EliminarMensaje(String unidad, String carpeta, String mensaje) {
        Retorno r = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return r;
    }

    @Override
    public Retorno InsertarLinea() {
        Retorno r = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return r;
    }

    @Override
    public Retorno InsertarLineaEnPosicion(int posicionLinea) {
        Retorno r = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return r;
    }

    @Override
    public Retorno BorrarLinea(int posicionLinea) {
        Retorno r = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return r;
    }

    @Override
    public Retorno BorrarTodo() {
        Retorno r = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return r;
    }

    @Override
    public Retorno BorrarOcurrenciasPalabraEnTexto(String palabraABorrar) {
        Retorno r = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return r;
    }

    @Override
    public Retorno ImprimirTexto() {
        Retorno r = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return r;
    }

    @Override
    public Retorno InsertarPalabraEnLinea(int posicionLinea, int posicionPalabra, String palabraAIngresar) {
        Retorno r = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return r;
    }

    @Override
    public Retorno InsertarPalabraYDesplazar(int posicionLinea, int posicionPalabra, String palabraAIngresar) {
        Retorno r = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return r;
    }

    @Override
    public Retorno BorrarPalabra(int posicionLinea, int posicionPalabra) {
        Retorno r = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return r;
    }

    @Override
    public Retorno BorrarOcurrenciasPalabraEnLinea(int posicionLinea, String palabraABorrar) {
        Retorno r = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return r;
    }

    @Override
    public Retorno ImprimirLinea(int posicionLinea) {
        Retorno r = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return r;
    }

    @Override
    public Retorno IngresarPalabraDiccionario(String palabraAIngresar) {
        Retorno r = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return r;
    }

    @Override
    public Retorno BorrarPalabraDiccionario(String palabraABorrar) {
        Retorno r = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return r;
    }

    @Override
    public Retorno ImprimirDiccionario() {
        Retorno r = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return r;
    }

    @Override
    public Retorno ImprimirTextoIncorrecto() {
        Retorno r = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return r;
    }

    @Override
    public Retorno CargarDistancias(int[][] Ciudades) {
        Retorno r = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return r;
    }

    @Override
    public Retorno BuscarCamino(int[][] M, String origen, String destino) {
        Retorno r = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return r;
    }

}
