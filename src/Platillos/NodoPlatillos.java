package Platillos;

public class NodoPlatillos {

    private Platillos dato;
    private NodoPlatillos next;

    public NodoPlatillos(Platillos dato) {
        this.dato = dato;
    }

    public String toString() {
        return "Nodo {" + " Dato = " + dato + "}";
    }

    public Platillos getDato() {
        return dato;
    }

    public void setDato(Platillos dato) {
        this.dato = dato;
    }

    public NodoPlatillos getNext() {
        return next;
    }

    public void setNext(NodoPlatillos next) {
        this.next = next;
    }
    
} // fin clase nodo platillos
