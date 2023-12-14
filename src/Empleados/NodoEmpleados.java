package Empleados;

public class NodoEmpleados {

    private Empleados dato;
    private NodoEmpleados siguiente;

    //constructores
    public NodoEmpleados(Empleados dato) {
        this.dato = dato;
    }

    public NodoEmpleados() {
    }

    //to string
    public String toString() {
        return "Nodo { " + " Dato = " + dato + "}";
    }

    //getter y setter
    public Empleados getDato() {
        return dato;
    }

    public void setDato(Empleados dato) {
        this.dato = dato;
    }

    public NodoEmpleados getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoEmpleados siguiente) {
        this.siguiente = siguiente;
    }

} // fin de la clase nodo empleados
