package ManejoOrdenes;

public class NodoListaDobleOrdenes {
    
    //atributos
    private ListaOrdenes dato;
    private NodoListaDobleOrdenes anterior;
    private NodoListaDobleOrdenes siguiente;

    //constructores
    public NodoListaDobleOrdenes(ListaOrdenes dato) {
        this.dato = dato;
    }

    public ListaOrdenes getDato() {
        return dato;
    }

    //getter y setter
    public NodoListaDobleOrdenes getAnterior() {
        return anterior;
    }

    public NodoListaDobleOrdenes getSiguiente() {
        return siguiente;
    }

    public void setDato(ListaOrdenes dato) {
        this.dato = dato;
    }

    public void setAnterior(NodoListaDobleOrdenes anterior) {
        this.anterior = anterior;
    }

    public void setSiguiente(NodoListaDobleOrdenes siguiente) {
        this.siguiente = siguiente;
    }

    //to string
    public String toString() {
        return dato.toString();
    }
    
} // fin de la clase nodo lista doble ordenes
