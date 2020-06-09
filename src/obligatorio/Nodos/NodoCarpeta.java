
package obligatorio.Nodos;

import obligatorio.Listas.ListaArchivos;

public class NodoCarpeta {
    Object dato;
    NodoCarpeta siguiente;
    ListaArchivos archivos;
    
    public NodoCarpeta(Object dato) {
        this.dato = dato;
        this.siguiente = null;
        this.archivos = new ListaArchivos();
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public NodoCarpeta getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCarpeta siguiente) {
        this.siguiente = siguiente;
    }

    public ListaArchivos getArchivos() {
        return archivos;
    }

    public void setArchivos(ListaArchivos archivos) {
        this.archivos = archivos;
    }
    
    
}
