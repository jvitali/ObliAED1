
package obligatorio.Nodos;

import obligatorio.Listas.ListaLineas;

public class NodoArchivo {
    Object dato;
    NodoArchivo siguiente;
    ListaLineas lineas;
    
    public NodoArchivo(Object dato) {
        this.dato = dato;
        this.siguiente = null;
        this.lineas = new ListaLineas();
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public NodoArchivo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoArchivo siguiente) {
        this.siguiente = siguiente;
    }

    public ListaLineas getLineas() {
        return lineas;
    }

    public void setLineas(ListaLineas lineas) {
        this.lineas = lineas;
    }
    
    
}
