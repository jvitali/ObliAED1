
package obligatorio.Nodos;

import obligatorio.Listas.ListaPalabras;

public class NodoLinea {
    //int Numero linea
    Object dato; 
    NodoLinea siguiente;
    ListaPalabras palabras;

    public NodoLinea(Object dato) {
        this.dato = dato;
        this.siguiente = null;
        this.palabras = new ListaPalabras();
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public NodoLinea getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLinea siguiente) {
        this.siguiente = siguiente;
    }

    public ListaPalabras getPalabras() {
        return palabras;
    }

    public void setPalabras(ListaPalabras palabras) {
        this.palabras = palabras;
    }
    
    
}
