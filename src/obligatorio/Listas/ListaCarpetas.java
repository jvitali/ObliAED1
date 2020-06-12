package obligatorio.Listas;

import obligatorio.Interfaces.IListas;
import obligatorio.Nodos.NodoCarpeta;

public class ListaCarpetas implements IListas {

    NodoCarpeta inicio;

    public ListaCarpetas() {
        this.inicio = null;
    }

    public NodoCarpeta getInicio() {
        return inicio;
    }

    public void setInicio(NodoCarpeta inicio) {
        this.inicio = inicio;
    }

    @Override
    public boolean Agregar(Object dato) {
        NodoCarpeta nuevo = new NodoCarpeta(dato);
        Boolean ret = false;
        if (!this.EsVacia() && !Buscar(dato)) {
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
        NodoCarpeta aux = this.inicio;
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
        NodoCarpeta aux = this.inicio;
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

    public boolean Borrar(Object dato) {
        boolean ret = false;
        NodoCarpeta aux = this.inicio;
        if (!this.EsVacia()) {
            while (aux != null && ret != true) {
                if (aux.getSiguiente().getDato() == dato) {
                    aux.setSiguiente(aux.getSiguiente().getSiguiente());
                    ret = true;
                }
                aux = aux.getSiguiente();
            }
        }
        return ret;
    }

}
