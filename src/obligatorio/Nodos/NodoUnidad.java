package obligatorio.Nodos;

import obligatorio.Listas.ListaCarpetas;

public class NodoUnidad {

    Object dato;
    NodoUnidad siguiente;
    ListaCarpetas carpetas;

    public NodoUnidad(Object dato) {
        this.dato = dato;
        this.siguiente = null;
        this.carpetas = new ListaCarpetas();
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public NodoUnidad getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoUnidad siguiente) {
        this.siguiente = siguiente;
    }

    public ListaCarpetas getCarpetas() {
        return carpetas;
    }

    public void setCarpetas(ListaCarpetas carpetas) {
        this.carpetas = carpetas;
    }

}
