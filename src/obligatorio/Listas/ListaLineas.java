package obligatorio.Listas;

import obligatorio.Interfaces.IListas;
import obligatorio.Nodos.NodoLinea;

public class ListaLineas implements IListas {

    NodoLinea inicio;

    @Override
    public boolean Agregar(Object dato) {
        NodoLinea nuevo = new NodoLinea(dato);
        Boolean ret = false;
        if (!this.EsVacia() && !Buscar(dato)) {
            nuevo.setSiguiente(this.inicio);
            ret = true;
        }
        this.inicio = nuevo;
        return  ret;
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
        NodoLinea aux = this.inicio;
        while (aux != null) {
            System.out.println(aux.getDato());
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
        NodoLinea aux = this.inicio;
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
