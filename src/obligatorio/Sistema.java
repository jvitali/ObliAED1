package obligatorio;

import obligatorio.Interfaces.ISistema;
import obligatorio.Listas.ListaPalabras;
import obligatorio.Listas.ListaUnidades;
import obligatorio.Nodos.NodoUnidad;
import obligatorio.Nodos.NodoArchivo;
import obligatorio.Nodos.NodoCarpeta;
import obligatorio.Nodos.NodoLinea;
import obligatorio.Nodos.Paises;

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

    public int[][] getCiudades() {
        return ciudades;
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
        diccionario.Vaciar();
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
        //r.valorString = unidades.getInicio().getCarpetas().Imprimir();
        return r;
    }

    @Override
    public Retorno AgregarMensaje(String unidad, String carpeta, String mensaje) {
        NodoArchivo nuevo = new NodoArchivo(mensaje);
        //en lugar de ser get inicio deberia ser buscar por unidad y nombre carpeta
        //carpetas.getInicio().getArchivos().Agregar(nuevo);
        Retorno r = new Retorno(Retorno.Resultado.OK);
        NodoCarpeta aux = (NodoCarpeta) unidades.getInicio().getCarpetas().Buscar(carpeta);
        r.valorBoolean = aux.getArchivos().Agregar(mensaje);
        return r;
    }

    @Override
    public Retorno EliminarMensaje(String unidad, String carpeta, String mensaje) {
        Retorno r = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        NodoCarpeta aux = (NodoCarpeta) unidades.getInicio().getCarpetas().Buscar(carpeta);
        r.valorBoolean = aux.getArchivos().Borrar(mensaje);
        return r;
    }

    @Override
    public Retorno InsertarLinea() { //A QUIEN?
        Retorno r = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return r;
    }

    @Override
    public Retorno InsertarLineaEnPosicion(int posicionLinea) { //A QUE ARCHIVO?
        Retorno r = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return r;
    }

    @Override
    public Retorno BorrarLinea(int posicionLinea) {//A QUE ARCHIVO?
        Retorno r = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return r;
    }

    @Override
    public Retorno BorrarTodo() {//A QUE ARCHIVO?
        Retorno r = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return r;
    }

    @Override
    public Retorno BorrarOcurrenciasPalabraEnTexto(String palabraABorrar) {//A QUE ARCHIVO?
        Retorno r = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return r;
    }

    @Override
    public Retorno ImprimirTexto() {//A QUE ARCHIVO?
        Retorno r = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return r;
    }

    @Override
    public Retorno InsertarPalabraEnLinea(int posicionLinea, int posicionPalabra, String palabraAIngresar) {//A QUE ARCHIVO?
        Retorno r = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return r;
    }

    @Override
    public Retorno InsertarPalabraYDesplazar(int posicionLinea, int posicionPalabra, String palabraAIngresar) {//A QUE ARCHIVO?
        Retorno r = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return r;
    }

    @Override
    public Retorno BorrarPalabra(int posicionLinea, int posicionPalabra) {//A QUE ARCHIVO?
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
        //r.valorString = unidades.getInicio().getCarpetas().getInicio().getArchivos().Buscar("Archivo1");
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
    public Retorno CargarDistancias(int[][] ciudades) {
        Retorno r = new Retorno(Retorno.Resultado.OK);
        this.ciudades = ciudades;
        return r;
    }

    @Override
    public Retorno BuscarCamino(int[][] M, String origen, String destino) {
        Retorno r = new Retorno(Retorno.Resultado.OK);
        String camino = "";
        int cantColumnas = M[0].length;
        int escalas = 0;
        int caminoMinimo = Integer.MAX_VALUE;
        int posOrgien = Paises.getPosicion(origen);
        int posDestino = Paises.getPosicion(destino);
        for (int i = 0; i < cantColumnas; i++) {
            if (M[posOrgien][i] != 0 && M[posDestino][i] != 0) {
                if (M[posOrgien][i] + M[posDestino][i] < caminoMinimo) {
                    caminoMinimo = M[posOrgien][i] + M[posDestino][i];
                    escalas = i;
                }

            }
        }
        camino = origen + " - " + Paises.getNombre(escalas) + " - " + destino;        
        return r;
    }

}
