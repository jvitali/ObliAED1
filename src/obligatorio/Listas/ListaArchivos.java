package obligatorio.Listas;

import obligatorio.Interfaces.IListas;
import obligatorio.Nodos.NodoArchivo;

public class ListaArchivos implements IListas {

    NodoArchivo inicio;

    @Override
    public void Agregar(Object dato) {
        NodoArchivo nuevo = new NodoArchivo(dato);
        if (!this.EsVacia()) {
            nuevo.setSiguiente(this.inicio);
        }
        this.inicio = nuevo;
    }

    @Override
    public void Borrarinicio() {
        if (!this.EsVacia()) {
            this.inicio = this.inicio.getSiguiente();
        }
    }

    //Hacerlo con recusrividad para eliminar el guion al final
    @Override
    public void Imprimir() {
        NodoArchivo aux = this.inicio;
        while (aux != null) {
            System.out.println("    " + aux.getDato());
            aux = aux.getSiguiente();
        }
    }

    @Override
    public boolean EsVacia() {
        return this.inicio == null;
    }

    @Override
    public void Vaciar() {
        this.inicio = null;
    }

    @Override
    public boolean Buscar(Object dato) {
        boolean ret = false;
        NodoArchivo aux = this.inicio;
        if (!this.EsVacia()) {
            while (aux != null && aux.getDato() != dato) {
                aux = aux.getSiguiente();
            }
            if (aux != null) {
                ret = true;
            }
        }
        return ret;
    }
}
