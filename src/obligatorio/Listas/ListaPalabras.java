package obligatorio.Listas;

import obligatorio.Interfaces.IListas;
import obligatorio.Nodos.NodoPalabra;

public class ListaPalabras implements IListas {

    NodoPalabra inicio;

    @Override
    public boolean Agregar(Object dato) {
        NodoPalabra nuevo = new NodoPalabra(dato);
        Boolean ret = false;
        if (!this.EsVacia() && Buscar(dato) != null) {
            nuevo.setSiguiente(this.inicio);
            ret = true;
        }
        this.inicio = nuevo;
        return ret;
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
        NodoPalabra aux = this.inicio;
        while (aux != null) {
            System.out.print(aux.getDato() + " ");
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

   
    public NodoPalabra Buscar(Object dato) {
        NodoPalabra aux = this.inicio;
        if (!this.EsVacia()) {
            while (aux != null && aux.getDato() != dato) {
                aux = aux.getSiguiente();
            }
        }
        return aux;
    }
}
